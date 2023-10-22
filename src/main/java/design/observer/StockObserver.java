package design.observer;

public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void Update(){
        System.out.println(sub.getAction()+",赶紧回归工作,"+this.name);
    }
}
