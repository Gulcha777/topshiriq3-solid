package vazifa3.after;

public class EmailSender implements MessageSender {
    @Override public void send(String to, String text) {
        System.out.println("[EMAIL] " + to + ": " + text);
    }
}
