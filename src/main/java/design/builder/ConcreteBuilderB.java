package design.builder;

public class ConcreteBuilderB extends Builder {
    private Product product = new Product();

    @Override
    public void BuilderA() {
        product.Add("部件X");
    }

    @Override
    public void BuilderB() {
        product.Add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
