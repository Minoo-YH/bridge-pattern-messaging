\# Bridge Pattern - Messaging System



\## About the Project



This is a simple Java project about the Bridge Design Pattern.



The Bridge Pattern separates the message types from the ways messages are sent. This makes it easier to add new message types or sending methods without changing the existing code.



I used an existing messaging example and extended it by adding a new way to send messages.



\## Original Project



I used the messaging example from this GitHub repository:



https://github.com/vesavvo/design\_patterns/tree/master/src/main/java/bridge/messaging



\## How It Works



The project has two message types:

\- `PersonalMessage`

\- `BusinessMessage`



Both extend the `Message` class.



The `MessageImp` interface is used for different ways of sending messages:

\- `EmailImp`

\- `SMSImp`

\- `InstantMessageImp`



The message types and sending methods can be used together without depending directly on each other.



\## What I Added



I added a new class called `PushNotificationImp`.



This class implements the `MessageImp` interface and has a `sendMessage()` method.



It prints a push notification message to the console. It does not send a real notification.



I also updated `Main.java` to test the new class with `BusinessMessage`.



I didn't need to change the existing message classes to add this feature.



\## How to Run



I used Java and IntelliJ IDEA for this project.



Open CMD in the project folder.



Compile the Java files:



```cmd

javac -d out src\\main\\java\\bridge\\messaging\\\*.java

```



Run the program:



```cmd

java -cp out bridge.messaging.Main

```



\## Screenshots



\### 1. Original Messaging System



This screenshot shows the original program working with Email, SMS, and Instant Message.



!\[Original program output](screenshot.png)



\### 2. Messaging System with Push Notification



This screenshot shows the program after adding the new Push Notification feature.



!\[Program output with push notification](screenshot2.png)



\## Conclusion



In this project, I learned how the Bridge Design Pattern works in Java.



I added a new sending method without changing the main structure of the program. I also tested the program using CMD to check that the new feature works.



This exercise helped me understand how the Bridge Pattern makes code easier to extend.



