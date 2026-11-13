package vazifa3.before;

/** BEFORE: DIP buzilgan - konkret sinflarga qattiq bog'liq. */
public class NotificationService {
    private final EmailSender email = new EmailSender();
    private final SmsSender sms = new SmsSender();

    public void notify(String channel, String to, String text) {
        if (channel.equals("EMAIL")) email.sendEmail(to, text);
        else if (channel.equals("SMS")) sms.sendSms(to, text);
        else throw new IllegalArgumentException("Noma'lum kanal: " + channel);
    }

    static class EmailSender { void sendEmail(String to, String t) { System.out.println("[EMAIL] " + to + ": " + t); } }
    static class SmsSender   { void sendSms(String to, String t)   { System.out.println("[SMS] " + to + ": " + t); } }
}
