const express = require('express')
const router = express.Router()
const adminController = require('../app/controllers/adminController')

router.route('/').get(adminController.index)

module.exports = router