import model.Order;
import model.OrderRepo;
import model.ProductRepo;

import java.util.Map;

public class ShopService {

//    ProductRepo productRepo = new ProductRepo();
//
//    //getProduct method return one Product from Products list
//    public String getProduct(String productID){
//        if (productRepo.products.containsKey(productID))
//            return productRepo.products.get(productID);
//        else return "This product ID doesn't exist!";
//    }
//
//    public Map<String,String> listProducts(){
//        return productRepo.products;
//    }

    OrderRepo orderRepo = new OrderRepo();

    public void addOrder(String orderID, Order product){
        orderRepo.addOrder(orderID,product);
    }
}
