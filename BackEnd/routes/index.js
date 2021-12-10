const express = require('express');
const router = express.Router();
const { upload, uploadImage } = require('../app/controllers/controller')
const adminRouter = require('./adminRouter')
const productRouter = require('./productRouter')
const commonRouter = require('./commonRouter')
router.use('/admin',adminRouter)
router.use('/common',commonRouter)
router.use('/product',productRouter)
// router.post('/upload', uploadImage, upload)

module.exports = router;