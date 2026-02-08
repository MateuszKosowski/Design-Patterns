package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("CodingDaily");

        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        Subscriber s3 = new Subscriber("Charlie");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Java Design Patterns Tutorial");

        System.out.println("\n(Bob unsubscribed)");
        channel.unsubscribe(s2);

        channel.uploadVideo("Why Observer Pattern is cool");
    }
}
