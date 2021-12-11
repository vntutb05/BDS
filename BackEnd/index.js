const express = require('express');
require('dotenv').config()
const conn = require('./core/database');
const router = require('./routes/index');
const fs = require('fs');
const app = express();

app.use(express.urlencoded({ extended :false}))
app.use(express.json());
app.use('/static/image', express.static(__dirname + '/upload'));
// app.use(userUpload)
//PORT
app.use(router)
const port = process.env.PORT || 3000
app.listen(port, () => {
    console.log(`server running port ${port}`); 
})
