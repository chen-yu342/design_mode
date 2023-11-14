package design.reflectsimplefactory;

public class Client {
    public static void main(String[] args) {

        Calculate calculate;
        calculate = OperationFactory.createOperation("add");
        calculate.setNumberA(5.0);
        calculate.setNumberB(3.0);
        System.out.println(calculate.getResult());
    }
}
