const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Cat = sequelize.define('Cat', {
        name: {
            type: Sequelize.TEXT,
            allownull: false
        },
        nickname: {
            type: Sequelize.TEXT,
            allownull: false
        },
        price: {
            type: Sequelize.DOUBLE,
            allownull: false
        }
    }, {
        timestamps: false
    });
    return Cat;
};