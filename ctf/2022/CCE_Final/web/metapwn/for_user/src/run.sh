
#!/bin/sh
cd /usr/src/app
npm install pm2 -g
npm install
pm2 start app.config.js
pm2 log app