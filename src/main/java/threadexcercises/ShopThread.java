package threadexcercises;

public class ShopThread extends Thread {
    private Shop shop;
    ShopThread (Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public void run() {
            shop.buy("Kiełbasa");

    }
}
