package design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式，产品类
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void Add(String part){
        parts.add(part);
    }
    public void Show(){
        System.out.println("product created");
        parts.forEach(System.out::println);
    }
}
