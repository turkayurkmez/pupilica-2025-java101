public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService(new SMSService());
        orderService.CreateOrder("Türkay",10000);


        EmailService emailService = new EmailService();
        OrderService mailOrderService = new OrderService(emailService);

        mailOrderService.CreateOrder("Necati", 500);

        WhatsAppService whatsAppService = new WhatsAppService();
        OrderService whatsAppOrderService = new OrderService(whatsAppService);

        whatsAppOrderService.CreateOrder("Yeşim",1500);

        Oyuncu oyuncu = new Oyuncu();
        oyuncu.Giy(new Etek());
        oyuncu.Giy(new Kazak());
    }
}