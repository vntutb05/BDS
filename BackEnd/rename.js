const fs = require('fs');
function renameDeletedImage(arrImage,id){
    const uriFolderImage = './upload'
    for(var i=0; i<arrImage.length; i++){
        if (fs.existsSync(`${uriFolderImage}/${arrImage[i]}`)) {
            fs.renameSync(`${uriFolderImage}/${arrImage[i]}`,`${uriFolderImage}/deleted_${id}_${arrImage[i]}`,err=>{
                if ( err ) console.log('ERROR: ' + err);
            })
        }
    }
}
module.exports = {
    renameDeletedImage,
}