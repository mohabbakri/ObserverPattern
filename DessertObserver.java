public class DessertObserver implements Observer 
{
    @Override
    public void update(foodMessage foodOrder) {
        System.out.println("DessertObserver : " + foodOrder.getMessageContent());
    }
}