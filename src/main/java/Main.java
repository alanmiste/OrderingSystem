import model.Order;
import model.OrderRepo;
import model.Product;
import model.ProductRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ShopService shopService = new ShopService();
        //get one product
        System.out.println(shopService.getOneProduct("1102"));

        //get all products
        System.out.println(shopService.listProduct());


//        ProductRepo productRepo = new ProductRepo();
//
//        //get back one product
//        System.out.println(productRepo.getProduct("1102"));
//
//        //get back all products as list
//        System.out.println(productRepo.products);
//--------------------------------------------------------
//        Map<String,String> order1 = new HashMap<>();
//        order1.put("1101",productRepo.getProduct("1101"));
//        order1.put("1102",productRepo.getProduct("1102"));
//
//        Map<String,String> order2 = new HashMap<>();
//        order2.put("1201",productRepo.getProduct("1201"));
//        order2.put("1202",productRepo.getProduct("1202"));
//        order2.put("1203",productRepo.getProduct("1203"));
//
//        System.out.println("ORDER 1: "+order1);
//        System.out.println("ORDER 2: "+order2);
//
//
//        Order order1obj =new Order(order1);
//        Order order2obj =new Order(order2);
//        shopService.addOrder("001",order1obj);
//        shopService.addOrder("002",order2obj);
//
//        System.out.println(shopService.orderRepo.orderList.get("001"));
//        System.out.println(shopService.orderRepo.orderList.get("002"));

        System.out.println("-------------");

        //add an order
//        Map<String,String> testOrder = new HashMap<>();
//        ShopService shopService = new ShopService();
//
//        testOrder.put("1000","test product");
//        testOrder.put("1001","test product1");
//
//        Order pp= new Order(testOrder);
//        shopService.addOrder("5555",pp);
//
//        testOrder.clear();
//        testOrder.put("2000", "secound test");
//        testOrder.put("2001", "secound test1");
//
//        Order pp1 = new Order(testOrder);
//
//        shopService.addOrder("55551",pp1);
//        System.out.println(shopService.orderRepo.orderList);
//
//        System.out.println("one Order: "+shopService.orderRepo.orderList);


    }
}
