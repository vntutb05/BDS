const commonService = require('../services/commonService')
module.exports = {
    index : async(req,res) => {
        return commonService.index(req,res)
    }
}
    
