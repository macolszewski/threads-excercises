package threadexcercises;

public class App 
{
    public static void main( String[] args )
    {

        Shop shop = new Shop("Łyżka");

        Thread t1 = new Thread(new ShopThread(shop));
        Thread t2 = new Thread(new DeliveryThread(shop));

        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
