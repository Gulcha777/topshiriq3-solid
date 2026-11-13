package vazifa1.after;

/** SRP: faqat email yuborish. */
public class EmailService {
    public void send(String to, String body) {
        System.out.println("Email -> " + to + "\n" + body);
    }
}
