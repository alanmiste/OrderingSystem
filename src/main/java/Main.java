import model.Product;
import model.ProductRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ProductRepo pp = new ProductRepo();

        //System.out.println(pp.products);
        //System.out.println(pp.example());

        ShopService shopService = new ShopService();

        System.out.println(shopService.getProduct("1102"));

    }
}
