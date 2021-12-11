{
    "status": 200,
    "message": "Get all product with type du-an ",
    "data": [
        {
            "Id": 58,
            "tinh": "a",
            "huyen": "a",
            "xa": "a",
            "category": "0",
            "hotProduct": "1",
            "forYouProduc": "0",
            "name": "Ngoc Tu",
            "description": "ass",
            "area": null,
            "price": 10000,
            "duong": null,
            "phapLy": null,
            "thoCu": null,
            "matTien": null,
            "ImgUrl": null,
            "ImgArray": null
        }
    ]
}

route GET:
localhost:3000/product/ : getAll
localhost:3000/product/hot : gethot
localhost:3000/product/:type : getBytype
example : localhost:3000/product/du-an : getAll
example : localhost:3000/product/dat-vuon : getAll
example : localhost:3000/product/mat-duong : getAll
example : localhost:3000/product/matduong : getAll : 404
localhost:3000/product/du-an?typeSort=0&min=0&max=1000 sort
typrSort : {
    0 : price,
    1 : area
}
localhost:3000/product/detail/:id : getAll
Route POST 
localhost:3000/common/search : 
body {
    "q" : 
}

