public class OrderService {

    private NotificationSender notificationSender;

    public OrderService(NotificationSender notificationSender){
        this.notificationSender = notificationSender;
    }

    public void CreateOrder(String customerName, double totalPrice){
        System.out.println(customerName + " isimli müşteri sipariş verdi. Toplam fiyat: "+totalPrice);

        //Burada mesaj göndermek istiyoruz.
       // SMSService smsService = new SMSService();

        //Peki ya email göndermek istesem?
       notificationSender.Send(customerName);
    }
}
