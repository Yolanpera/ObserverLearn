public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new TypeOneObserver(subject);
        new TypeTwoObserver(subject);
        new TypeThreeObserver(subject);

        System.out.println("change first");
        subject.setState(2);
    }
}
