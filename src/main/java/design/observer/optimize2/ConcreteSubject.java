package design.observer.optimize2;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/11/13 10:30
 */

/**
 * 具体主题或具体通知者，将有关状态存入具体观察者对象；
 * 在具体主题的内部状态改变时，给所有登记过的观察者发出通知。具体主题角色通常用一个具体子类实现。
 */
public class ConcreteSubject extends Subject {
    public String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
