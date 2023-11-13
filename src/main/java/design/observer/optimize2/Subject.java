package design.observer.optimize2;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/11/13 10:14
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 可翻译为主题或抽象通知者，一般用一个抽象类或者一个接口实现。
 * 它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象
 */
abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void Attach(Observer observer) {
        observers.add(observer);
    }

    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    public void Notify() {
        observers.forEach(Observer::Update);
    }
}
