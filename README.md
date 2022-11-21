# RenderCrashFix
A 1.17.1 Fabric mod which prevents (very) frequent crashes while loading worlds.

**Fabric API has been used to develop this mod, so I'm not sure how verifiable the runs with it are.**

## How does it work?
The mod injects into two methods which cause `NullPointerException`s:
- `EntityRenderDispatcher#getSquaredDistanceToCamera` (two methods, very frequent crashes)
- `Entity#isInvisibleTo` (much rarer)

I've been testing the mod for several hours and experienced no crashes.

I haven't looked deeper into the source of the problem, but I do believe that the `Entity#isInvisibleTo` issue is related to WorldPreview, which sadly hasn't been updated in months.

## Why?
I've been playing Mine a Chunk on this version nd the amount of crashes drove me insane. So I decided to craft this silly little mod to fix it.

It provides absolutely no advantage in the actual game.
