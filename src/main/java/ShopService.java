import model.ProductRepo;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();

    //getProduct method return one Product from Products list
    public String getProduct(String productID){
        if (productRepo.products.containsKey(productID))
            return productRepo.products.get(productID);
        else return "This product ID doesn't exist!";
    }

    //TODO make listProducts method
}
