package design.template;

public class TestPaperA extends TestPaper {
    @Override
    protected String Answer1() {
        return "b";
    }

    @Override
    protected String Answer2() {
        return "c";
    }

    @Override
    protected String Answer3() {
        return "a";
    }
}
