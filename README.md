# RenderCrashFix
A 1.17.1 Fabric mod which prevents (very) frequent crashes while loading worlds.

## How does it work?
-- Removed previous info as it's wrong
WorldPreview tries to render spawner/spawner entities which causes the game to crash (NullPointerException). Not sure about the exact cause.
