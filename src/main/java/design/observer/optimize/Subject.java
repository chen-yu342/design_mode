package design.observer.optimize;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/23 9:19
 */

/**
 *通知者接口
 */
public interface Subject {
    void Attach(Observer observer);
    void DeAttach(Observer observer);
    void Notify();
}
