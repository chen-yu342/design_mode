package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式;前台秘书类
 */
public class Secretary {
    //同事列表
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    //增加

    public void Attach(StockObserver stockObserver){
        observers.add(stockObserver);
    }
    public void Notify(){
        observers.forEach(StockObserver::Update);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
