module.exports = db => {
  const router = require('express').Router()
  const { sign, verify } = require(`${__basedir}/lib/jwt`)
  const { generateRoomCode, hash } = require(`${__basedir}/lib/util`)

  const checkNotAuth = (req, res, next) => {
    const token = verify(req.header('Access-Token') ?? '')
    if (token === '') next()
    else res.status(403).json({ status: false, message: 'no authorization' })
  }

  const filterUsername = username => {
    let result = username
    const blackList = ['<', '>', '"', "'"]
    blackList.forEach(x => {
      if (result.includes(x)) result = result.replaceAll(x, '')
    })

    return result;
  }

  router.get('/', (req, res) => {
    // test routing
    const token = verify(req.header('Access-Token') ?? '')
    if (token !== '') res.status(200).json({ status: true, message: token['username'] })
    else res.status(403).json({ status: true, message: {} })
  })

  router.post('/register', checkNotAuth, async (req, res) => {
    let { username, password, comment } = req.body
    if (username === undefined || password === undefined || comment === undefined) return res.status(403).json({ status: false, message: 'no username or password or comment' })
    if (username.length < 6 || password.length < 6 || /[<|>]/.test(comment)) return res.status(403).json({ status: false, message: 'error condition' })
    
    const roomcode = generateRoomCode(username)
    
    username = filterUsername(username)
    password = hash(password)
    
    db.user.create({ username, password, roomcode, comment }).then(_ => {
      db.room.create({ roomcode }).then(_ => {
        res.status(200).json({status: true, message: {} })
      }).catch(_ => {
        res.status(403).json({ status: false, message: {} })
      })
    }).catch(e => {
      if (e.name === 'SequelizeUniqueConstraintError') res.status(409).json({status: false, message: 'duplicate username'})
      else res.status(403).json({ status: false, message: {} })
    })
  })

  router.post('/login', checkNotAuth, async (req, res) => {
    let { username, password } = req.body
    if (username === undefined || password === undefined) return res.status(403).json({ status: false, message: 'no username or password' })
    const roomcode = generateRoomCode(username)

    username = filterUsername(username)
    password = hash(password) 
    db.user.findOne({ where: { username, password } }).then(result => {
      res.status(200).json({ status: true, message: sign({ username, roomcode: result.roomcode }) })
    }).catch(_ => {
      res.status(403).json({ status: false, message: {} })
    })
  })

  return router
}