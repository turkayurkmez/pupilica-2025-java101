public class SMSService implements  NotificationSender {
    public void  Send(String name){
        System.out.println(name + " kişisine SMS gönderildi");
    }
}
