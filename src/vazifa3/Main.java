package vazifa3;

import vazifa3.after.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== BEFORE: DIP buzilgan =====");
        new vazifa3.before.NotificationService().notify("EMAIL", "gulruh@mail.uz", "Salom!");
        new vazifa3.before.NotificationService().notify("SMS", "+998901234567", "Salom!");

        System.out.println("\n===== AFTER: DIP + ISP =====");
        NotificationService svc = new NotificationService(
            Arrays.asList(new EmailSender(), new SmsSender()));
        svc.notifyAll("gulruh", "Topshiriq qabul qilindi");

        // Yangi kanal - NotificationService o'zgarmadi!
        NotificationService svc2 = new NotificationService(
            Arrays.asList(new EmailSender(), new SmsSender(), new TelegramSender()));
        svc2.notifyAll("gulruh", "Yangi kanal qo'shildi");
    }
}
