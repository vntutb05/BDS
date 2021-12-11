const productService = require('../services/productService')
module.exports = {
    hotProduct : async(req,res) => {
        return await productService.getHotProduct(req,res)
    },
    allProduct : async(req,res) => {
        return await productService.getHotProduct(req,res)
    },
    productBytype : async(req,res) => {
        return await productService.getProductByType(req,res)
    },
   
}
    
