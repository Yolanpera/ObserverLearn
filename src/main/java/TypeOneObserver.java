public class TypeOneObserver extends Observer{

    public TypeOneObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("subject has benn changed for one");
    }
}
