const adminService = require('../services/adminService')
module.exports = {
    postProduct : async(req,res) => {
        return adminService.createProduct(req,res)
    },
    deleteProduct : async(req,res) =>{
        return adminService.deleteProduct(req,res)
    }
}
    
