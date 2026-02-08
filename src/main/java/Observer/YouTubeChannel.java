package Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private String channelName;
    private List<Observer> subscribers = new ArrayList<>();

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void uploadVideo(String title) {
        System.out.println("\n--- Channel " + channelName + " uploaded: " + title + " ---");
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Observer observer : subscribers) {
            observer.update(title);
        }
    }
}
