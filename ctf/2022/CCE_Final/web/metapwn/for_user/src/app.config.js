module.exports = {
  apps: [{
    name: 'app',
    script: './app.js',
    instances: 1,
    exec_mode: 'cluster',
    watch: '.',
    ignore_watch: ['./uploads', './sessions']
  }]
}