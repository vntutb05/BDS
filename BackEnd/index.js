const express = require('express');
const app = express();
const ConnectMysql = require('./database');
app.use('/static/image', express.static(__dirname + '/upload'));
const path = require('path');
const cors = require("cors");
// var fs = require('fs');
// var dir = './upload/tmp';
// if (!fs.existsSync(dir)) {
//     fs.mkdirSync(dir);
// }
// else {
//     fs.rmdirSync(dir, { recursive: true });
// }
app.use(cors());
const userUpload = require('./routes/index');

app.use('/user', userUpload);
ConnectMysql.connect((error) => {
    if (error) {
        console.log("error", error);
    }
    else {
        console.log("connected");
    }
})
app.get('/hotproduct', (req, res) => {
    let sql = "select * from Real_estate where hotProduct ='1';";

    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})
app.get('/foryouproduct', (req, res) => {
    let sql = "select * from Real_estate where forYouProduc ='1';";

    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})

app.get('/dat-du-an', (req, res) => {
    let sql = "select * from Real_estate where category ='0';";
    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})
app.get('/dat-mat-duong', (req, res) => {
    let sql = "select * from Real_estate where category ='2';";
    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})
app.get('/dat-vuon', (req, res) => {
    let sql = "select * from Real_estate where category ='1';";
    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})
app.get('/detail/:id', (req, res) => {
    const id = req.params.id
    let sql = `select * from Real_estate where Id =${id};`;

    ConnectMysql.query(sql, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        res.send(result);
        // res.send('sql successful')
    })
})


//PORT
const port = process.env.PORT || 3001
app.listen(port, () => { console.log(`server running port ${port}`); })
