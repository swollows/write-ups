# README
## GOAL
- You can download our nuclear power system's firmware.
- There are multiple vulnerabilities (at least 5) in firmware, so firmware update is very urgent.
- The mission is that you have to figure out vulnerabilties and update the patched firmware via firmware update function.

## INFO
- Server instance is individual, don't share it to other team.
- Health checker (SLA) will run every 15 min..
- You can `reset` and `restart` service by using `reset` and `restart` GET REQUEST (e.g. `http://${SERVER}/reset`)
  - `reset` will restore your patched firmware to original one.
  - `restart` will just restart service.
- Score will be decreased if **service doesn't work properly** or **vulnerabilities are not patched**.
