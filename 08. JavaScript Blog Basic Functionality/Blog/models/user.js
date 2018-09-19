const Sequelize = require('sequelize');
const encryption = require("../utilities/encryption");

module.exports = function (sequelize) {
    const User = sequelize.define('User', {
        email: {
            type: Sequelize.STRING,
            required: true,
            unique: true,
            allowNull: false
        },
        passwordHash: {
            type: Sequelize.STRING,
            required: true
        },
        fullName: {
            type: Sequelize.STRING,
            required: true
        },
        scienceDegree: {
            type: Sequelize.STRING,
            required: true,
            allowNull: true
        },
        university: {
            type: Sequelize.STRING,
            required: true,
            allowNull: true
        },        
        salt: {
            type: Sequelize.STRING,
            required: true
        },
    },
    {
        timestamps: false
    });

    User.prototype.authenticate = function (password) {
        let inputPasswordHash = encryption.hashPassword(password, this.salt);
        return inputPasswordHash === this.passwordHash;
    };

    User.associate = (models)  => {
        User.hasMany(models.Article, {
            foreignKey: 'autorId',
            sourceKey: 'id'
        });
    };

    return User;
};