package design.signal;

public class Client {
    public static void main(String[] args) {
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1 = LoadBalancer.getLoadBalancer();
        loadBalancer2= LoadBalancer.getLoadBalancer();
        loadBalancer3 = LoadBalancer.getLoadBalancer();
        loadBalancer4 = LoadBalancer.getLoadBalancer();

        if(loadBalancer1==loadBalancer2&&loadBalancer2==loadBalancer3&&loadBalancer3==loadBalancer4){
            System.out.println("是同一个实例");
        }
        loadBalancer1.addServer("server1");
        loadBalancer1.addServer("server2");
        loadBalancer1.addServer("server3");
        loadBalancer1.addServer("server4");
        // 模拟客户端分发请求
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("请求分发到服务器"+server);
        }
    }
}
