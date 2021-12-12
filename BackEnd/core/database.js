const mysql = require("mysql")

const conn = mysql.createConnection('mysql://root:05052000@localhost:3306/BDS_TNX')
conn.connect(function(err) {
    if (err) throw err;
    console.log("Connected!!!")
});
module.exports = {
    conn : conn
};
