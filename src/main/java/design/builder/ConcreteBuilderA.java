package design.builder;

public class ConcreteBuilderA extends Builder {
    private Product product = new Product();

    @Override
    public void BuilderA() {
        product.Add("部件A");
    }

    @Override
    public void BuilderB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
