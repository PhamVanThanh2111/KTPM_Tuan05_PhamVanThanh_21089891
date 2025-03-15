package iuh.fit.se.ObserverPattern_Stock;

public class ObserverDemo_Stock {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Alice");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        // Giá cổ phiếu thay đổi
        appleStock.setPrice(155.0);
        investor1.update("Apple", 155.0);
        investor2.update("John", 155.0);

        appleStock.setPrice(160.0);
    }
}
