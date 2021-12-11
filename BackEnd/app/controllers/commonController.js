const commonService = require('../services/commonService')
module.exports = {
    search : async(req,res) => {
        return commonService.search(req,res)
    }
}
    
