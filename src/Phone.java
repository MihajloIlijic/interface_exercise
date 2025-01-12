public class Phone implements KindOfMessage {
    @Override
    public void message(String message) {
        System.out.println("Sending SMS: " + message);
    }
}