package vazifa3.after;

public class SmsSender implements MessageSender {
    @Override public void send(String to, String text) {
        System.out.println("[SMS] " + to + ": " + text);
    }
}
