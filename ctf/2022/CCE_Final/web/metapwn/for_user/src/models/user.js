const Sequelize = require('sequelize')

module.exports = ((sequelize, DataTypes) => {
  return sequelize.define('user', {
    idx: { type: Sequelize.INTEGER, autoIncrement: true, unique: true },
    username: { type: Sequelize.STRING, allowNull: false, unique: true, primaryKey: true },
    password: { type: Sequelize.STRING, allowNull: false },
    comment: { type: Sequelize.STRING, allowNUll: false },
    target: { type: Sequelize.STRING, allowNUll: true },
    index: { type: Sequelize.STRING, allowNUll: true },
    edit: { type: Sequelize.STRING, allowNUll: true },
    roomcode: { type: Sequelize.STRING, allowNull: false },
  })
})