const Sequelize = require('sequelize');

module.exports = function(sequelize){
    const Film = sequelize.define('Film', {
        name: {
            type: Sequelize.TEXT,
            allownull: false,
            required: true
        },
        genre: {
            type: Sequelize.TEXT,
            allownull: false,
            required: true
        },
        director: {
            type: Sequelize.TEXT,
            allownull: false,
            required: true
        },
        year: {
            type: Sequelize.INTEGER,
            allownull: false,
            required: true
        }
    }, {
        timestamps:false
    });
    return Film;
};