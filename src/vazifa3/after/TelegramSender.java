package vazifa3.after;

public class TelegramSender implements MessageSender {
    @Override public void send(String to, String text) {
        System.out.println("[TELEGRAM] " + to + ": " + text);
    }
}
