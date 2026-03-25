package DAY 6;
class Notification{
    void send(){
        System.out.println("Notification from parent class");
    }
}
class EmailNotification extends Notification{
    void send(){
        System.out.println("Sending EMail Notification");
    }
}
class SmsNotification extends Notification{
    void send(){
        System.out.println("Sending SMS Notification");
    }
}
public class Notify{
    public static void main(String[] args){
        Notification n ;
        n = new EmailNotification();
        n.send();
        n = new SmsNotification();
        n.send();
        }
}