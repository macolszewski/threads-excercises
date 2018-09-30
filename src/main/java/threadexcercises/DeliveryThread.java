package threadexcercises;

public class DeliveryThread extends Thread {
    private Shop shop;

    public DeliveryThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        shop.delivery("Kiełbasa");
    }
}
