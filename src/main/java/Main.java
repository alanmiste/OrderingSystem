import model.Product;
import model.ProductRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ProductRepo pp = new ProductRepo();

        //System.out.println(pp.products);
        //System.out.println(pp.example());

        ShopService shopService = new ShopService();

        //get back one product
        System.out.println(shopService.getProduct("1102"));

        //get back all products as list
        System.out.println(shopService.listProducts());



    }
}
