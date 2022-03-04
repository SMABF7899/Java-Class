package tamrin6;

import java.util.List;

public class Cart{
    private List<Commodity> commodities;
    private int totalPrice;

    public Cart(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }
}
