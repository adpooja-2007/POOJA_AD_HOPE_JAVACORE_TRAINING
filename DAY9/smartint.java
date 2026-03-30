package DAY9;
abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo(){
      System.out.println("It is a device");  
    }
}
class Light extends SmartDevice{
    void turnOn(){
        System.out.println("Light on");
    }
    void turnOff(){
        System.out.println("Light off");
    }
}
interface remote{
    void change();
}
class Tv implements remote{
    void change(){
        System.out.println("channel change");
    }
}
public class smartint {
    public static void main(String[] args){
        remote r = new Tv();
        r.change();
        SmartDevice device = new Light();
        device.turnOn();
    }
}