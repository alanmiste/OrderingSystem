package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {
    Product iphone11 = new Product("1101","iPhone 11");
    Product iphone11pro = new Product("1102","iPhone 11 Pro");
    Product iphone12 = new Product("1201","iPhone 12");
    Product iphone12pro = new Product("1202","iPhone 12 Pro");
    Product iphone12proMax = new Product("1203","iPhone 12 Pro Max");

    public Map<String,String> products = new HashMap<>();

    public ProductRepo() {
        this.products.put(iphone11.id(),iphone11.productName());
        this.products.put(iphone11pro.id(),iphone11pro.productName());
        this.products.put(iphone12.id(),iphone12.productName());
        this.products.put(iphone12pro.id(),iphone12pro.productName());
        this.products.put(iphone12proMax.id(),iphone12proMax.productName());
    }

//    public Map<String, String> getProducts() {
//        return products;
//    }

    public String getProduct(String productID){
        if (products.containsKey(productID))
            return products.get(productID);
        else return "This product ID doesn't exist!";
    }

    //    List<Product> ex1 = new ArrayList<>(List.of(iphone11,iphone12));
//
//    public Map<String,Product> example(){
//
//        for(Product product : ex1){
//            addProduct(product);
//        }
//        return products;
//    }
//
//    public void addProduct(Product product){
//        products.put(product.id(),product);
//    }
}
