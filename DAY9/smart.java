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
public class smart {
    public static void main(String[] args){
        SmartDevice device = new Light();
        device.turnOn();
    }
}