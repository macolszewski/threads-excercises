package threadexcercises;

public class Shop {
    private String shopItem;

    public Shop(String shopItem) {
        this.shopItem = shopItem;
    }

    public String getShopItem() {
        return shopItem;
    }

    public void setShopItem(String shopItem) {
        this.shopItem = shopItem;
    }

    public synchronized void buy(String item) {
        while (true) {
            if (shopItem != null && !item.equals(shopItem)) {
                System.out.println("Czekam na towar!");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Kupiłeś " + item);
                break;
            }
        }
    }

    public synchronized void delivery(String item) {
        this.shopItem = item;
        System.out.println("Dostarczono " + item);
        notify();
    }
}
