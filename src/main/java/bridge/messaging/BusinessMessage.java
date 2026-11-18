package bridge.messaging;

// Class for business messages
public class BusinessMessage extends Message {

    public BusinessMessage(MessageImp imp) {
        super(imp);
    }

    // Send a business message
    @Override
    public void send(String message) {
        System.out.println("Sending a business message:");
        super.send(message);
    }
}
