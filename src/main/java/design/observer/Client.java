package design.observer;

public class Client {
    public static void main(String[] args) {
        Secretary tongzhijie = new Secretary();
        StockObserver tonshi1 = new StockObserver("阿达", tongzhijie);
        StockObserver tonshi2 = new StockObserver("阿二", tongzhijie);

        //记录下两位同事
        tongzhijie.Attach(tonshi1);
        tongzhijie.Attach(tonshi2);

        tongzhijie.setAction("老板回来了");

        tongzhijie.Notify();

    }
}
