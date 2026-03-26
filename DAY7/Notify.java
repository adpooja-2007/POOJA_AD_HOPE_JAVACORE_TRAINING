package DAY7;
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
        Notification n1 ;
        n1 = new EmailNotification();
        Notification n2;
        n2 = new SmsNotification();
        Notification[] notify = {n1,n2};
        for(Notification n : notify){
            n.send();
        }
        }
}