package Chalange;

public interface Order {
    void execute();
}

class BuyStock implements Order{
    private Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}

class SellStock implements Order{
    private Stock myStock;

    public SellStock(Stock someStock){
        this.myStock = someStock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}