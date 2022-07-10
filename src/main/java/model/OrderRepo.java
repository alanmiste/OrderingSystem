package model;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    public Map<String , Order> orderList = new HashMap<>();

    public void addOrder(String orderID, Order order){
        orderList.put(orderID, order);
    }

//    public Map<String, Order> getOrderList() {
//        return orderList;
//    }
}
