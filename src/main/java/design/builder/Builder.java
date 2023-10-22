package design.builder;

/***
 * 抽象建造者类，确定产品由两个部分A、B组成，并且申明一个得到结果的方法
 */
abstract class Builder {
    public abstract void BuilderA();
    public abstract void BuilderB();
    public abstract Product GetResult();
}
