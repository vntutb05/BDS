const adminService = require('../services/adminService')
module.exports = {
    index : async(req,res) => {
        console.log("Helolo")
        return adminService.index(req,res)
    }
}
    
