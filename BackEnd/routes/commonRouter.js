const express = require('express')
const router = express.Router()
const commonController = require('../app/controllers/commonController')

router.route('/').post(commonController.search)

module.exports = router