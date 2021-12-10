const express = require('express')
const router = express.Router()
const commonController = require('../app/controllers/commonController')

router.route('/').get(commonController.index)

module.exports = router