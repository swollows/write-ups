const { v4: uuidv4 } = require('uuid')
const fs = require('fs')
const crypto = require('crypto')

const generateRoomCode = id => {
  const md5 = crypto.createHmac('md5', id + '__' + process.env.UUID_KEY).update(id + '__' + process.env.UUID_KEY).digest('hex')
  return `${md5.slice(0,8)}-${md5.slice(8,12)}-${md5.slice(12,16)}-${md5.slice(16,20)}-${md5.slice(20,32)}`
}

const uploadFile = (ext, filedata) => {
  const path = `${__basedir}/uploads/${uuidv4()}.${ext}`
  fs.writeFileSync(path, filedata, 'utf-8')
  return path.split('/').pop()
}

const deleteFile = path => {
  const fpath = `${__basedir}/uploads/${path}`
  if (fs.existsSync(fpath)) fs.unlinkSync(fpath)
}

const hash = data => crypto.createHmac('sha256', process.env.HASH_KEY).update(data).digest('hex')

const genRandomString = (length = 3) => {
  let result = ''
  const table = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'
  for (var i = 0; i < length; i++) {
    result += table.charAt(Math.floor(Math.random() * table.length))
  }
  return result
}

const genPow = () => {
  const target = genRandomString()
  console.log(target)
  const md5 = crypto.createHash('md5').update(target).digest('hex')
  return md5.slice(0, 7)
}

const checkPow = (pow, input) => {
  const md5 = crypto.createHash('md5').update(input).digest('hex')
  if (md5.slice(0, 7) === pow) return 1
  else return 0
}

module.exports = { generateRoomCode, uploadFile, deleteFile, hash, genPow, checkPow }