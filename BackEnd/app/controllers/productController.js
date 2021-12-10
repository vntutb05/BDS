const productService = require('../services/productService')
module.exports = {
    hotProduct : async(req,res) => {
        return await productService.getHotProduct(req,res)
    },
    allProduct : async(req,res) => {
        return await productService.getHotProduct(req,res)
    },
    duAnProduct : async(req,res) => {
        return await productService.getDuAnProduct(req,res)
    },
    datVuonProduct : async(req,res) => {
        return await productService.getDatVuonProduct(req,res)
    },
    matDuongProduct : async(req,res) => {
        return await productService.getMatDuongProduct(req,res)
    },
}
    
