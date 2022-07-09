import model.Order;
import model.OrderRepo;
import model.Product;
import model.ProductRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();

        //get back one product
        System.out.println(productRepo.getProduct("1102"));

        //get back all products as list
        System.out.println(productRepo.products);

        //add an order
        Order pp= new Order("1101","iphone 11");

        ShopService shopService = new ShopService();
        shopService.addOrder("5555",pp);
        shopService.addOrder("5555",pp);
        System.out.println(shopService.orderRepo.orderList);


    }
}
