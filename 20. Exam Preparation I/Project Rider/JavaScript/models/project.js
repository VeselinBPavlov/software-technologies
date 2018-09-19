const Sequelize = require('sequelize');

module.exports = function (sequelize) {
   let Project = sequelize.define('Project', {
           title: {
               type: Sequelize.TEXT,
               allownull: false
           },
            description: {
                type: Sequelize.TEXT,
                allownull: false
            },
            budget: {
                type: Sequelize.INTEGER,
                allownull: false
            }
       }, {
            timestamps: false
   });
    return Project;
};