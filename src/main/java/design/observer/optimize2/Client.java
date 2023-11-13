package design.observer.optimize2;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/11/13 10:57
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.Attach(new ConcreteObserver("X",concreteSubject));
        concreteSubject.Attach(new ConcreteObserver("Y",concreteSubject));
        concreteSubject.Attach(new ConcreteObserver("Z",concreteSubject));

        concreteSubject.setSubjectState("ABCD");
        concreteSubject.Notify();
    }
}
