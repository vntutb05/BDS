const {conn} = require('../../core/database');
const {TypeProduct,Category} = require('../../typing')
module.exports = {
    getHotProduct : async (req,res) =>{
        const sql = `SELECT * FROM Real_estate WHERE hotProduct = 1 AND isDeleted = 0`
        await conn.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                message : "Get all product hot",
                data : result
            })
        })
    },
    getAllProduct : async (req,res) => {
        const sql = `SELECT * FROM Real_estate WHERE isDeleted = 0`
        await conn.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                message: "GEt all product",
                data : result
            })
        })
    },
    getProductByType : async (req,res) => {
        const param = req.params;
        const query = req.query
        const category = param.type;
        let type ;
        const typeSort = parseInt(query.typeSort)
        const min = parseInt(query.min) * 1000000 || 0
        const max = parseInt(query.max) * 1000000 || 100
        let sortSql = '';
        if (category == Category.DuAn){
            type = TypeProduct.DuAn
        }else if(category == Category.DatVuon){
            type = TypeProduct.DatVuon
        }else if (category == Category.MatDuong){
            type = TypeProduct.MatDuong
        }else {
            return res.status(400).json({
                status : 400,
                message : "Page not found",
                data :[]
            })
        }
        if(typeSort != undefined){
            if(typeSort == 0 ){
                sortSql = `AND ${min} < price < ${max}`
            }
            if(typeSort == 1 ){
                sortSql = `AND ${min} < area < ${max}`
            }
        }
        const sql = `SELECT * FROM Real_estate WHERE category = ${type} AND isDeleted = 0 ${sortSql} `
        await conn.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                message : `Get all product with type ${category} ${sortSql}`,
                data : result
            })
        })
    },
    getDetail : async(req,res) => {
        const param = req.params
        const id = req.params.id
        if(id != undefined){
            const sql = `SELECT * FROM Real_estate WHERE id = ${id}`
            await conn.query(sql,(err, result)=>{
                if (err || result.length == 0){
                    return res.status(500).json({
                        status : 500,
                        message : "Error",
                        data :[]
                    })
                } 
                return res.status(200).json({
                    status : 200,
                    message : `Get detail product with id ${id}`,
                    data : result
                })
            })
        }else{
            return res.status(400).json({
                status : 400,
                message : "Page not found",
                data :[]
            })
        }
    }
}