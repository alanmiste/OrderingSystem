import model.Order;
import model.OrderRepo;
import model.Product;
import model.ProductRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();

        //get back one product
        System.out.println(productRepo.getProduct("1102"));

        //get back all products as list
        System.out.println(productRepo.products);

        //add an order
        Map<String,String> testOrder = new HashMap<>();
        ShopService shopService = new ShopService();

        testOrder.put("1000","test product");
        testOrder.put("1001","test product1");

        Order pp= new Order(testOrder);
        shopService.addOrder("5555",pp);

        testOrder.clear();
        testOrder.put("2000", "secound test");
        testOrder.put("2001", "secound test1");

        Order pp1 = new Order(testOrder);

        shopService.addOrder("55551",pp1);
        System.out.println(shopService.orderRepo.orderList);

        System.out.println("one Order: "+shopService.orderRepo.orderList.containsKey("55551"));


    }
}
