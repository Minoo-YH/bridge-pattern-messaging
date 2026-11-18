package bridge.messaging;

// Class for sending push notifications
public class PushNotificationImp implements MessageImp {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending a push notification: " + message);
    }
}
