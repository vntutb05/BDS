const mysql = require("mysql")

const conn = mysql.createConnection('mysql://root:05052000@containers-us-west-6.railway.app:6558/railway')
conn.connect(function(err) {
    if (err) throw err;
    console.log("Connected!!!")
});
module.exports = {
    conn : conn
};
