package bridge.messaging;

// Class for sending emails
public class EmailImp implements MessageImp {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending an email: " + message);
    }
}
