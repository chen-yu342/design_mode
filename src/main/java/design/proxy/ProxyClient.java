package design.proxy;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/16 15:09
 */
public class ProxyClient {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("哈哈");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();

    }
}
