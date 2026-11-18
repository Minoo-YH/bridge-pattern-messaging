package bridge.messaging;

public class Main {
    public static void main(String[] args) {

        // Test personal message with email
        Message personal = new PersonalMessage(new EmailImp());
        personal.send("Hello, how are you?");

        // Test business message with SMS
        Message business = new BusinessMessage(new SMSImp());
        business.send("Meeting at 10 AM.");

        // Test instant messaging
        Message chat = new PersonalMessage(new InstantMessageImp());
        chat.send("See you soon!");

        // Test push notification
        Message notification = new BusinessMessage(new PushNotificationImp());
        notification.send("You have a new notification!");
    }
}
