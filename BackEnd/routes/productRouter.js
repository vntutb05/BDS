const express = require('express')
const router = express.Router()
const productController = require('../app/controllers/productController')

router.route('/').get(productController.hotProduct)

module.exports = router