package design.observer.optimize;

import java.util.ArrayList;
import java.util.List;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/23 9:26
 */
public class Boss implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void DeAttach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        observers.forEach(Observer::Update);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
