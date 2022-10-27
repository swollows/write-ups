const express = require('express')
const compression = require('compression')
const db = require('./models/index')

const app = express()
const __DIR = '/usr/src/app'
global.__basedir = __DIR

require('dotenv').config()
db.sequelize.sync()

app.set('views', __DIR + '/views')
app.set('view engine', 'ejs')
app.engine('html', require('ejs').renderFile)
 
app.use(express.static('static'))
app.use(express.json({ limit: '50mb' }))
app.use(express.urlencoded({ extended: true, limit: '50mb' }))

app.use(compression())

app.disable('x-powered-by')

const index = require('./routes/index')(db)
const apiUser = require('./routes/api/user')(db)
const apiRoom = require('./routes/api/room')(db)
const apiFriend = require('./routes/api/friend')(db)

app.use('/', index)
app.use('/api/user', apiUser)
app.use('/api/room', apiRoom)
app.use('/api/friend', apiFriend)

app.get('*', (req, res) => {
  res.status(404)
  res.render('error/error404')
})

console.log('==== Restarted ====')
app.listen(3000)