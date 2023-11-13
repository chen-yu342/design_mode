package design.observer.optimize;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/23 14:56
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println("请继续工作");
    }
}
