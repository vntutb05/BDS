const {conn} = require('../../core/database');
const rename = require('../../rename')
module.exports = {
    createProduct : async (req,res) =>{
        const body = req.body

        return res.status(200).json("abc")
    },
    deleteProduct : async (req,res) =>{
        const param = req.params
        const id = param.id
        const checkIdSql = `SELECT * FROM Real_estate WHERE id = ${id} AND isDeleted = 0`
        await conn.query(checkIdSql,(err, result)=>{
            if (err){
                return res.status(500).json({
                    status : 500,
                    message : err.message,
                    data :[]
                })
            }
            if(result.length ==0){
                return res.status(400).json({
                    status : 400,
                    message : "Product not exists",
                    data :[]
                })
            }else{
                const sql = `UPDATE Real_estate SET isDeleted = 1,updated_at = NOW() WHERE id = ${id}`
                conn.query(sql,(err1, result1)=>{
                    if (err1){
                        return res.status(500).json({
                            status : 500,
                            message : err1.message,
                            data :[]
                        })
                    }
                    let arrImage = JSON.parse(result[0].ImgArray) || []
                    rename.renameDeletedImage(arrImage,id)
                    return res.status(200).json({
                        status : 200,
                        message : "Delete success",
                        data :[]
                    })
                })
            } 
        })
    }
}