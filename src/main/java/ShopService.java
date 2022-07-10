import model.Order;
import model.OrderRepo;
import model.ProductRepo;

import java.util.Map;

public class ShopService {

    OrderRepo orderRepo = new OrderRepo();

    public void addOrder(String orderID, Order product){
        orderRepo.addOrder(orderID,product);
    }

    public Order getOrder(String orderID){ //it should take orderID and return the order
        return orderRepo.orderList.get(orderID);
    }
}
