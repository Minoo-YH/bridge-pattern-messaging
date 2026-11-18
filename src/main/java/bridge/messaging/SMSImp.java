package bridge.messaging;

// Class for sending SMS messages
public class SMSImp implements MessageImp {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending an SMS: " + message);
    }
}
