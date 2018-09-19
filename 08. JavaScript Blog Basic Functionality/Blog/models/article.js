const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    const Article = sequelize.define('Article', {
        publicationType: {
            type: Sequelize.STRING,                        
            allowNull: false,
            required: true
        },
        title: {
            type: Sequelize.STRING,                        
            allowNull: false,
            required: true
        },
        keyWords: {
            type: Sequelize.STRING,                        
            allowNull: false,
            required: true
        },
        summary: {
            type: Sequelize.STRING,                        
            allowNull: false,
            required: true
        },
        content: {
            type: Sequelize.TEXT,                        
            allowNull: false,
            required: true
        },
        date: {
            type: Sequelize.DATE,                        
            allowNull: false,
            required: true,
            defaultValue: Sequelize.NOW
        },        
    });

    Article.associate = function (models) {
        Article.belongsTo(models.User, {
            foreignKey: 'autorId',
            targetKey: 'id'
        });
    };

    return Article;
};