package design.reflectsimplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Fanshe {
    public Fanshe() {

    }
    public static Fanshe getInstance(){
        return FactoryInstance.instance;
    }
    public static class FactoryInstance{
        private static Fanshe instance = new Fanshe();
    }
    public Calculate createCalculate(String flag) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = getProperties(flag);
        Class<?> c = Class.forName(name);
        Calculate o = (Calculate)c.newInstance();
        return o;
    }
    private String getProperties(String flag){
        Properties pro = new Properties();
        InputStream stream = ClassLoader.getSystemResourceAsStream("config.properties");
        try {
            pro.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro.getProperty(flag);
    }
}
