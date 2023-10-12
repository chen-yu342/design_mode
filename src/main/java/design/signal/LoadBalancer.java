package design.signal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer loadBalancer = null;
    // TODO 如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，
    //  被volatile修饰的成员变量可以确保多个线程都能够正确处理
    private volatile static LoadBalancer loadBalancer2 = null;
    private List serverList = null;

    //私有构造函数
    private LoadBalancer() {
        serverList = new ArrayList();
    }
    //TODO 1.为了避免多个线程同时调用getInstance,可以使用关键字synchronized,
    // 但是这样直接锁整个方法会降低效率,因此并不是最好的实现方式
    synchronized public static LoadBalancer getLoadBalancer(){
        if(loadBalancer==null){
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }
    //TODO 2.只需锁定代码 loadBalancer = new LoadBalancer();
    public static LoadBalancer getLoadBalancer2(){
        if(loadBalancer==null){
            synchronized (LoadBalancer.class){
                loadBalancer = new LoadBalancer();
            }
        }
        return loadBalancer;
    }

    //TODO 3.其实2还是有点问题，线程A B都进入了loadBalancer==null，A锁住了，然后创建实例，
    // 但其实B是不知道的，仍然会再创建一个实例，所以要用DCL 双重检查锁定（Double-Check Locking）
    public static LoadBalancer getLoadBalancer3(){
        if(loadBalancer==null){
            synchronized (LoadBalancer.class){
                if (loadBalancer==null){
                    loadBalancer = new LoadBalancer();
                }
            }
        }
        return loadBalancer;
    }

    public void addServer(String server){
        serverList.add(server);
    }
    public void removeServer(String server){
        serverList.remove(server);
    }
    public String getServer(){
        Random random = new Random();
        int n = random.nextInt(serverList.size());
        return  (String)serverList.get(n);
    }
}
