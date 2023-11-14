package design.reflectsimplefactory;

public class OperationFactory {
    public static Calculate createOperation(String operation){
        Calculate calculate = null;
        try {
            calculate = Fanshe.getInstance().createCalculate(operation);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return calculate;
    }
}
