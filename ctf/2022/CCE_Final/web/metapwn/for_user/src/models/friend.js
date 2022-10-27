const Sequelize = require('sequelize')

module.exports = ((sequelize, DataTypes) => {
  return sequelize.define('friend', {
    idx: { type: Sequelize.INTEGER, autoIncrement: true, unique: true, primaryKey: true },
    to: { type: Sequelize.STRING, allowNull: false },
    from: { type: Sequelize.STRING, allowNull: false },
  })
}) 