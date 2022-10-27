const Sequelize = require('sequelize')

module.exports = ((sequelize, DataTypes) => {
  return sequelize.define('room', {
    idx: { type: Sequelize.INTEGER, autoIncrement: true, unique: true },
    roomcode: { type: Sequelize.STRING, allowNull: false, unique: true, primaryKey: true },
    wallpaper: { type: Sequelize.STRING, allowNull: true },
    photoframe: { type: Sequelize.STRING, allowNull: true },
    monitor: { type: Sequelize.STRING, allowNull: true },
    music: { type: Sequelize.STRING, allowNull: true },
  })
})