package design.factory;

public class HistogramChat implements Chart{
    public HistogramChat() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
