package iuh.fit.se.ObserverPattern_Stock;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Nhà đầu tư " + name + " được thông báo: Cổ phiếu " + stockName + " có giá mới: " + newPrice);
    }
}
