const express = require('express')
const router = express.Router()
const adminController = require('../app/controllers/adminController')

router.route('/product/create').post(adminController.postProduct)
router.route('/product/delete/:id').delete(adminController.deleteProduct)

module.exports = router