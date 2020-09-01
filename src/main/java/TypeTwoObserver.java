public class TypeTwoObserver extends Observer {

    public TypeTwoObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("subject has benn changed for two");
    }
}
