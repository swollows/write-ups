const { uploadFile, deleteFile } = require(`${__basedir}/lib/util`)

module.exports = db => {
  const router = require('express').Router()
  const { verify } = require(`${__basedir}/lib/jwt`)
  
  const getRoom = async username => await db.user.findOne({ where: { username } })
  const getUser = async roomcode => await db.user.findOne({ where: { roomcode } })

  const checkAuth = (req, res, next) => {
    res.set('Cache-Control', 'no-cache, no-store, must-revalidate')
    const token = verify(req.header('Access-Token') ?? '')
    if (token !== '' && (req.username = token['username']) !== '') next()
    else res.status(403).json({ status: false, message: 'no authorization' })
  }

  router.get('/', checkAuth, async (req, res) => {
    const { roomcode } = await getRoom(req.username)

    db.room.findOne({ where: { roomcode } }).then(result => {
      db.user.findOne({ where: { roomcode } }).then(user => {
        if (req.username === 'admin_'){
          user.dataValues.comment = process.env.FLAG
          res.status(200).send({ status: true, message: { username: req.username, ...user.dataValues, ...result.dataValues } })
        } else {
          res.status(200).send({ status: true, message: { username: req.username, ...user.dataValues, ...result.dataValues } })
        }
      }).catch(e => {
        res.status(500).json({ status: false, message: {} })
      })
    }).catch(e => {
      res.status(500).json({ status: false, message: {} })
    })
  })

  router.get('/:uuid([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})', checkAuth, async (req, res) => {
    const { username, roomcode } = await getUser(req.params.uuid)

    db.room.findOne({ where: { roomcode } }).then(result => {
      db.user.findOne({ where: { roomcode } }).then(user => {
        
        res.status(200).send({ status: true, message: { username, ...user.dataValues, ...result.dataValues } })
      }).catch(e => {
        res.status(500).json({ status: false, message: {} })
      })
    }).catch(e => {
      res.status(500).json({ status: false, message: {} })
    })
  })

  router.post('/upload', checkAuth, async (req, res) => {
    const { roomcode } = await getRoom(req.username)
    const { type, filename, filedata } = req.body
    if (type === undefined || filename === undefined || filedata === undefined) return res.status(403).json({ status: false, message: 'no type or filedata' })
    const file = Buffer.from(filedata, 'base64')
    const path = uploadFile(filename.split('.').pop(), file)

    if (!['wallpaper', 'monitor', 'photoframe', 'music'].includes(type)) return res.status(403).json({ status: false, message: {} })

    db.room.findOne({ attribute: [type], where: { roomcode } }).then(r => {  
      const path_ = r[type]
      if (path_ !== null) deleteFile(path_) 
      db.room.update({ [type]: path }, { where: { roomcode } }).then(_ => {  
        res.status(200).send({ status: true, message: { [type]: path } })
      }).catch(_ => {
        res.status(500).send({ status: false, message: {} })
      })
    }).catch(_ => {
      res.status(500).send({ status: false, message: {} })
    })

  })

  router.post('/edit', checkAuth, async (req, res) => {
    const { roomcode } = await getRoom(req.username)
    const { target, index, edit } = req.body
    if (target === undefined || index === undefined || edit === undefined) return res.status(403).json({ status: false, message: 'no edit' })
    
    if (!(/^[a-zA-Z0-9]*$/.test(target)) || !(/^[a-zA-Z0-9]*$/.test(index)) || !(/^[a-zA-Z0-9]*$/.test(edit))) return res.status(403).json({ status: false, message: 'invalid edit' })

    db.user.update({ target, index, edit }, { where: { roomcode } }).then(r => {
      res.status(200).send({ status: true, message: {}})
    }).catch(_ => {
      res.status(500).send({ status: false, message: {} })
    })

  })

  return router
}
