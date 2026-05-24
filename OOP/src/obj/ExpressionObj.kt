package obj

data class ProductModel(
    val ProductId: String,
    val ProductName: String,
    val Price: Double,
)

object Product{  // this is objected
    val products = mutableListOf<ProductModel>(
        ProductModel("P001", "Apple", 1.5),
        ProductModel("P002", "Banana", 0.8),
        ProductModel("P003", "Orange", 1.2),
        ProductModel("P004", "Mango", 2.0),
        ProductModel("P005", "Pineapple", 3.5),
        ProductModel("P006", "Grapes", 2.3),
        ProductModel("P007", "Watermelon", 4.0),
        ProductModel("P008", "Papaya", 1.8),
        ProductModel("P009", "Strawberry", 5.0),
        ProductModel("P010", "Blueberry", 6.0)
    )
    fun requestProductList(result: ProductReq, products: MutableList<ProductModel>, productCode: String){
        try {
            if(products.isEmpty()){
                result.onError("No products available", 400)
            }
            products.forEach { pro ->
                if(pro.ProductId == productCode){
                    result.onSuccess(pro, 400)
                    return
                }
            }
            result.onError("Product not found", 400)

        }catch (e: Exception){

        }
    }
    fun isExistProduct(productId: String): Boolean{
        return products.any { product -> product.ProductId == productId }
    }
    fun addProduct(product: ProductModel, result: ProductReq){
        if(isExistProduct(product.ProductId)){
            result.onFailure("This code already exists", 403)
        }else{
            products.add(product)
            result.onSuccess(product, 400)
        }
    }
}

interface ProductReq{
    fun onSuccess(response: ProductModel, code:Int)
    fun onFailure(message: String, code: Int)
    fun onError(message: String, code: Int)
}



fun main() {
    Product.requestProductList(
        result = object : ProductReq
         {
            override fun onSuccess(response: ProductModel, code: Int) {
                println("Product id: ${response.ProductId} \nProductName: ${response.ProductName} \nPrice: ${response.Price} \n")
            }

            override fun onFailure(message: String, code: Int) {
                println("Error: $message")
            }

            override fun onError(message: String, code: Int) {
                println("Error: $message")
            }
        } ,
        products = Product.products,
        productCode = "P009"
    )
                                                                                                // and object here is expression object.
    Product.addProduct(ProductModel("P011", "Blueberry", 6.0), result = object : ProductReq {
        override fun onSuccess(response: ProductModel, code: Int) {
            println("Product added successfully\nCode: ${response.ProductId}\nProductName: ${response.ProductName} \nPrice: ${response.Price} \n")
        }

        override fun onFailure(message: String, code: Int) {
            println("Error: $message")
        }

        override fun onError(message: String, code: Int) {
            println("Error: $message")
        }
    })
    println(Product.products.size)

}