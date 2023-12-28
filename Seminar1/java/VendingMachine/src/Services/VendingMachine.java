package Services;

import java.util.List;

import Domain.Product;

public class VendingMachine {

    private Holder hold;
    private CoinDispenser coin;
    private Display disp;
    private List<Product> assort;

    public VendingMachine(Holder hold, CoinDispenser coin, Display disp, List<Product> assort) {
        this.hold = hold;
        this.coin = coin;
        this.disp = disp;
        this.assort = assort;
    }

    // Покупка продукта с заданным идентификатором
    public void buyProduct(long id) {
        // assort.remove(id);
        int indexProduct = 0;
        for (Product p : assort) {
            if(p.getId() == id){
                indexProduct = assort.indexOf(p);
            }
        }
        releaseProduct(assort.get(indexProduct).getPlace());
    }

    // Реализация продукта c установленного места
    public void releaseProduct(int place) {
        int indexProduct = -1;
        for (Product p : assort) {
            if(p.getPlace() == place){
                indexProduct = assort.indexOf(p);
            }
        }
        assort.remove(indexProduct);
    }

    public Holder getHold() {
        return hold;
    }

    public void setHold(Holder hold) {
        this.hold = hold;
    }

    public CoinDispenser getCoin() {
        return coin;
    }

    public void setCoin(CoinDispenser coin) {
        this.coin = coin;
    }

    public Display getDisp() {
        return disp;
    }

    public void setDisp(Display disp) {
        this.disp = disp;
    }

    public List<Product> getAssort() {
        return assort;
    }

    public void setAssort(List<Product> assort) {
        this.assort = assort;
    }

}
