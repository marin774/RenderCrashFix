# RenderCrashFix
A 1.17.1 Fabric mod which prevents (very) frequent crashes while loading worlds.

## What does it change?
WorldPreview tries to render entities in spawners (which don't exist yet?) which causes the game to crash with a NullPointerException.
