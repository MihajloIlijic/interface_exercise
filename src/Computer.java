public class Computer implements KindOfMessage {
    @Override
    public void message(String message) {
        System.out.println("Sending Email: " + message);
    }
}