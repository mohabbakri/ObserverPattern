import java.util.*;


public class FoodOrderNotify implements FoodSubject {
    
    private List<Observer> foodOrders = new ArrayList<>();
 
    @Override
    public void status(Observer order) {
        foodOrders.add(order);
    }
 
   @Override
    public void notifyTheUpdate(foodMessage foodOrder) {
        for(Observer order: foodOrders) {
            order.update(foodOrder);
        }
    }
}