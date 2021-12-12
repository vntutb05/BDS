const multer = require('multer');
const ConnectMysql = require('../../core/database');

const multerConfig = multer.diskStorage({
    destination: (req, files, callback) => {
        callback(null, 'upload/');
    },
    filename: (req, files, callback) => {
        const ext = files.mimetype.split('/')[1];
        callback(null, `image-${Date.now()}.${ext}`);
    }
})

const upload = multer({
    storage: multerConfig,
})
exports.uploadImage = upload.array('myFiles', 12)



exports.upload = (req, res) => {
    let array = [];
    for (let i = 0; i < req.files.length || 0; i++) {
        if (req.files[i].filename)
            array.push(`"${req.files[i].filename}"`);
    }
    //console.log('arrayarrayarrayarray', array);
    let data = req.body;
    data = { ...data, 'ImgArray': '[' + array + ']' }
    console.log('arrayarrayarray', data);
    delete data.myFiles;

    //let sql = "insert into Real_estate(tinh, huyen, xa, category, hotProduct, forYouProduc, name, description, area, price, duong, phapLy, thoCu, matTien, ImgUrl) values";
    let sql = "insert into Real_estate SET ?";

    ConnectMysql.query(sql, data, (err, result) => {
        if (err) console.log("sql error", err);
        console.log(result);
        // res.send('sql successful')
    })
    res.status(200).json({
        success: 'success',
    })
}