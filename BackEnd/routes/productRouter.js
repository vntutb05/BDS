const express = require('express')
const router = express.Router()
const productController = require('../app/controllers/productController')

router.route('/').get(productController.allProduct)
router.route('/hot').get(productController.hotProduct)
router.route('/:type').get(productController.productBytype)
router.route('/detail/:id').get(productController.getDetail)

module.exports = router