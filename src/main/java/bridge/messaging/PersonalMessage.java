package bridge.messaging;

// Class for personal messages
public class PersonalMessage extends Message {

    public PersonalMessage(MessageImp imp) {
        super(imp);
    }

    // Send a personal message
    @Override
    public void send(String message) {
        System.out.println("Sending a personal message:");
        super.send(message);
    }
}
