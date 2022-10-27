module.exports = db => {
  const router = require('express').Router()
  const { verify } = require(`${__basedir}/lib/jwt`)
  const { genPow, checkPow } = require(`${__basedir}/lib/util`)
  const powList = [{username: 'admin__', pow: ''}]

  const getRoom = async username => await db.user.findOne({ where: { username } })

  const getFriends = async username => {
    const tos = await db.friend.findAll({ attributes: ['from'], where: { to: username } })
    const froms = await db.friend.findAll({ attributes: ['to'], where: { from: username } })
    const toArray = tos.map(x=>x.from)
    const fromArray = froms.map(x=>x.to)
    const friends = []

    toArray.forEach(to => {
      if (fromArray.includes(to)) friends.push(to)
    })
    return friends
  }

  const checkAuth = (req, res, next) => {
    const token = verify(req.header('Access-Token') ?? '')
    if (token !== '' && (req.username = token['username']) !== '') next()
    else res.status(403).json({ status: false, message: 'no authorization' })
  }

  router.get('/', checkAuth, async (req, res) => {
    const friends = await getFriends(req.username)
    res.status(200).send({ status: true, message: friends })
  })

  router.post('/roomcode', checkAuth, async (req, res) => {
    const friends = await getFriends(req.username)
    const { username } = req.body
    if (friends.includes(username) || req.username === username) {
      const { roomcode } = await getRoom(username)
      res.status(200).send({ status: true, message: roomcode })
    } else {
      res.status(403).send({ status: false, message: '' })
    }
  })

  router.get('/pow', checkAuth, async (req, res) => {
    const { username } = req
    const pow = genPow()
    let flag = 1;

    for (let i = 0; i < powList.length; i++) {
      if (powList[i].username === username) {
        powList[i].pow = pow;
        flag = 0
        break
      }
    }

    if (flag) {
      powList.push({ username, pow })
    }

    res.status(200).send({ status: true, message: { pow } })
  })

  router.get('/request', checkAuth, async (req, res) => {
    const username = req.username
    const friends = await getFriends(username)
    db.friend.findAll({ attributs: ['from'], where: { to: username } }).then(r => {
      if (r === null) res.status(200).send({ status: true, message: [] })
      else {
        const result = []
        const froms = r.map(x => x.from)
        froms.forEach(from => {
          if (!friends.includes(from)) result.push(from)
        })
        res.status(200).send({ status: true, message: result })
      }
    })
    
    
  })

  router.get('/receive', checkAuth, async (req, res) => {
    const friends = await getFriends(req.username)
    db.friend.findAll({ attributs: ['to'], where: { from: req.username } }).then(r => {
      if (r === null) res.status(200).send({ status: true, message: [] })
      else {
        const result = []
        const tos = r.map(x=>x.to)
        tos.forEach(to => {
          if (!friends.includes(to)) result.push(to)
        })
        res.status(200).send({ status: true, message: result })
      }
    })
  })

  router.post('/request', checkAuth, async (req, res) => {
    const input = req.body.pow
    const secret = req.body.secret
    const username = req.username

    let pow = undefined
    for (let i = 0; i < powList.length; i++) {
      if (powList[i].username === username) {
        pow = powList[i];
        break
      }
    }

    console.log(powList)
    console.log(pow)
    if (secret !== process.env.SECRET_POW) {
      if(!pow || !pow.pow) return res.status(500).send({ status: false, message: 'genPow first' })
    }

    if (secret === process.env.SECRET_POW || checkPow(pow.pow, input)) {
      for (let i = 0; i < powList.length; i++) {
        if (powList[i].username === username) {
          powList[i].pow = '';
          break
        }
      }

      const { from } = req.body
      const to = req.username
      if (to === from) return res.status(403).send({ status: false, message: 'request self' })

      db.user.findOne({ where: { username: from } }).then(r => { // check exist user
        if (r === null) return res.status(404).send({ status: false, message: 'no user' })
        db.friend.findOne({ where: { to, from } }).then(r => { // check already request
          if (r !== null) return res.status(403).send({ status: false, message: 'duplicate request' })
          db.friend.create({ to, from }).then(_ => {
            res.status(200).send({ status: true, message: {} })
          }).catch(_ => {
            res.status(500).send({ status: false, message: {} })
          })
        }).catch(_ => { // no requests
          res.status(500).send({ status: false, message: {} })
        })
      }).catch(_ => { // is no user
        res.status(500).send({ status: false, message: {} })
      })
    } else {
      res.status(500).send({ status: false, message: 'pow Fail' })
    }
  })

  return router
}