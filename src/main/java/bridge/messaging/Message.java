package bridge.messaging;

// Base class for all message types
public abstract class Message {

    private MessageImp messageImp;

    public Message(MessageImp messageImp) {
        this.messageImp = messageImp;
    }

    // Send message using the selected method
    public void send(String message) {
        messageImp.sendMessage(message);
    }
}
