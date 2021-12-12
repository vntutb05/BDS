const express = require('express')
const router = express.Router()
const adminController = require('../app/controllers/adminController')
const { upload, uploadImage } = require('../app/controllers/controller')


router.route('/product/create').post(uploadImage, upload)
router.route('/product/delete/:id').delete(adminController.deleteProduct)

module.exports = router