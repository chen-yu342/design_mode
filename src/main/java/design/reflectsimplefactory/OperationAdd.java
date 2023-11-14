package design.reflectsimplefactory;

public class OperationAdd extends Calculate{
    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
