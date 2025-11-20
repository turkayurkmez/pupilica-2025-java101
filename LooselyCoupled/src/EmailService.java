public class EmailService  implements NotificationSender{
    @Override
    public void Send(String name) {
        System.out.println("Email gönderildi");
    }
}
