public class Tablet implements KindOfMessage {
    @Override
    public void message(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}