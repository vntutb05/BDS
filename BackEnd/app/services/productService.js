const ConnectMysql = require('../../core/database');
module.exports = {
    getHotProduct : async (req,res) =>{
        const sql = `SELECT * FROM Real_estate WHERE hotProduct = 1`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
    getAllProduct : async (req,res) => {
        const sql = `SELECT * FROM Real_estate`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
    getProductByType : async (req,res) => {
        const sql = `SELECT * FROM Real_estate WHERE category = ${req.category_id}`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
    getDuAnProduct : async (req,res) => {
        const sql = `SELECT * FROM Real_estate WHERE category = 0`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
    getMatDuongProduct : async (req,res) => {
        const sql = `SELECT * FROM Real_estate WHERE category = 2`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
    getDatVuonProduct : async (req,res) => {
        const sql = `SELECT * FROM Real_estate WHERE category = 1`
        await ConnectMysql.query(sql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message
                })
            } 
            return res.status(200).json({
                status : 200,
                data : result
            })
        })
    },
}