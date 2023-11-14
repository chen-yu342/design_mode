package design.reflectsimplefactory;

public abstract class Calculate {
    protected Double numberA;
    protected Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }
    public abstract double getResult();
}
