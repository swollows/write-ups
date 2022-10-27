module.exports = db => {
  const router = require('express').Router()

  router.get('/', async (req, res) => {
    res.render('index')
  })

  router.get('/register', async (req, res) => {
    res.render('register')
  })

  router.get('/login', async (req, res) => {
    res.render('login')
  })

  router.get('/logout', async (req, res) => {
    res.render('logout')
  })

  router.get('/room', async (req, res) => {
    res.render('room')
  })

  router.get('/friends', async (req, res) => {
    res.render('friends')
  })

  router.get('/uploads/:uuid([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}.(png|jpg|jpeg|mp3|gif))', async (req, res) => {
    res.sendFile(req.params.uuid, { root: './uploads' })
  })

  router.get('/room/:uuid([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})', async (req, res) => {
    res.render('anotherRoom', { uuid: req.params.uuid })
  })

  return router
}