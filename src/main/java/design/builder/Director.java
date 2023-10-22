package design.builder;

/**
 * 指挥者类
 */
public class Director {
    public void Construct(Builder builder){
        builder.BuilderA();
        builder.BuilderB();
    }
}
