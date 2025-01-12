import java.util.ArrayList;
import java.util.Scanner;
public class Main implements Device {
    static public Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String message = scan.nextLine();

        ArrayList<KindOfMessage> devices = new ArrayList<>();
        devices.add(new Tablet());
        devices.add(new Phone());
        devices.add(new Computer());

        for (KindOfMessage device : devices) {
            device.message(message);
        }
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}