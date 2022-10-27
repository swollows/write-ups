const jwt = require('jsonwebtoken')

const sign = payload => {
  return jwt.sign(payload, process.env.JWT_KEY, {
    algorithm: 'HS256', 
    expiresIn: '24h',  
    issuer: 'cce'
  })
}

const verify = token => {
  try {
    const decoded = jwt.verify(token, process.env.JWT_KEY)
    return decoded
  } catch (err) {
    return ''
  }
}


module.exports = { sign, verify }