var mysql = require("mysql")

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'quenmatpassroi',
    database: 'BDS_TNX',
    port: '3306',
})
module.exports = connection;
