public class AppetizerObserver implements Observer 
{
    @Override
  
    public void update(foodMessage foodOrder) {
        System.out.println("AppetizerObserver: " + foodOrder.getMessageContent());
    }
}