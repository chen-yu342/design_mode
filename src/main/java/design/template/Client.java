package design.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("学生甲");
        TestPaperA testPaperA = new TestPaperA();
        System.out.println(testPaperA.Answer1());
        System.out.println(testPaperA.Answer2());
        System.out.println(testPaperA.Answer3());
        System.out.println("学生乙");
        TestPaperB testPaperB = new TestPaperB();
        System.out.println(testPaperB.Answer1());
        System.out.println(testPaperB.Answer2());
        System.out.println(testPaperB.Answer3());
    }
}
