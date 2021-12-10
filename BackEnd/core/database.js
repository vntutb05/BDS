const mysql = require("mysql")

const connection = mysql.createConnection({
    host: process.env.DB_HOST || 'localhost',
    user: process.env.DB_USER ,
    password: process.env.DB_PASS ,
    database: process.env.DB_TABLE,
    port: process.env.DB_PORT || 3306,
})
module.exports = connection;
