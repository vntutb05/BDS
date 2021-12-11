const {conn} = require('../../core/database');
module.exports = {
    search : async (req,res) =>{
        let body = req.body;
        if(body.q && body.q != ''){
            const sql = `SELECT * FROM Real_estate WHERE name LIKE "%${body.q}% AND isDeleted = 0"`
            await conn.query(sql,(err, result)=>{
                if (err){
                    return res.status(500).json({
                        status : 500,
                        message : err.message,
                        data :[]
                    })
                } 
                return res.status(200).json({
                    status : 200,
                    message : `Get all product with input search ${body.q}`,
                    data : result
                })
            })
        }else {
            return res.status(200).json({
                status : 200,
                message : `Input search not exists`,
                data : []
            })
        }
      
    }
}