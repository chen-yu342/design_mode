package design.observer.optimize;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/23 9:24
 */
abstract class Observer {
    protected String name;
    protected Subject sub;

    private String SubjectState;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void Update();

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
