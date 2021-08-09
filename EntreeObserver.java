public class EntreeObserver implements Observer 
{
    @Override
    public void update(foodMessage foodOrder) {
        System.out.println("EntreeObserver : " + foodOrder.getMessageContent());
    }
}