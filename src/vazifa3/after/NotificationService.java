package vazifa3.after;

import java.util.List;

/** DIP: konkret sinfga emas, MessageSender abstraksiyasiga bog'liq. */
public class NotificationService {
    private final List<MessageSender> senders;
    public NotificationService(List<MessageSender> senders) { this.senders = senders; }
    public void notifyAll(String to, String text) {
        for (MessageSender s : senders) s.send(to, text);
    }
}
