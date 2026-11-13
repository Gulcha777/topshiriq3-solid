# Topshiriq №3 (M3 + A3): SOLID tamoyillari va Refaktoring

**Fan:** Dasturlash texnologiyalari  
**Talaba:** Xamroyeva Gulruh  
**Guruh:** 1-1DIM-24  
**Til:** Java 11+

## Loyiha tuzilmasi

```
src/
├── vazifa1/   (SRP)  before/OrderManager.java, after/{Order,OrderItem,InvoiceService,EmailService}.java, Main.java
├── vazifa2/   (OCP)  before/DiscountCalculator.java, after/{DiscountStrategy,NoDiscount,StudentDiscount,VeteranDiscount,SeasonalDiscount,LoyaltyDiscount,PriceCalculator}.java, Main.java
└── vazifa3/   (DIP+ISP) before/NotificationService.java, after/{MessageSender,EmailSender,SmsSender,TelegramSender,NotificationService}.java, Main.java
```

## Ishga tushirish

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")

java -cp out vazifa1.Main
java -cp out vazifa2.Main
java -cp out vazifa3.Main
```

## SOLID tamoyillari qo'llanishi

| Tamoyil | Vazifa | Tavsif |
|---------|--------|--------|
| SRP | Vazifa 1 | OrderManager → Order + InvoiceService + EmailService |
| OCP | Vazifa 2 | if/else → Strategy pattern, yangi tur qo'shish oson |
| DIP | Vazifa 3 | NotificationService → MessageSender interfeysi |
| ISP | Vazifa 3 | Katta interfeys o'rniga kichik MessageSender |
