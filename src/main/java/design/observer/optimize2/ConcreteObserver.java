package design.observer.optimize2;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/11/13 10:34
 */

/**
 * 具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 * 具体观察者角色可以保存一个指向具体主题对象的引用。具体观察者角色通常用一个具体子类实现
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerSate;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void Update() {
        String subjectState = concreteSubject.getSubjectState();
        System.out.println("观察者 "+name+ " 的状态是 "+subjectState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
