package DAY9;
import java.util.*;
interface Device {
    void turnOn();
    void turnOff();
    String getName();
}
class Light implements Device {
    private String name;
    public Light(String name) {
        this.name = name;
    }
    public void turnOn() {
        System.out.println(name + " Light ON");
    }
    public void turnOff() {
        System.out.println(name + " Light OFF");
    }
    public String getName() {
        return name;
    }
}
class AC implements Device {
    private String name;
    public AC(String name) {
        this.name = name;
    }
    public void turnOn() {
        System.out.println(name + " AC ON");
    }
    public void turnOff() {
        System.out.println(name + " AC OFF");
    }
    public String getName() {
        return name;
    }
}
class SensorData {
    private boolean motionDetected;
    private double temperature;
    private int hour;
    public SensorData(boolean motionDetected, double temperature, int hour) {
        this.motionDetected = motionDetected;
        this.temperature = temperature;
        this.hour = hour;
    }
    public boolean isMotionDetected() {
        return motionDetected;
    }
    public double getTemperature() {
        return temperature;
    }
    public int getHour() {
        return hour;
    }
}
interface Rule {
    boolean evaluate(SensorData data);
    void execute();
}
class MotionLightRule implements Rule {
    private Device light;
    public MotionLightRule(Device light) {
        this.light = light;
    }
    public boolean evaluate(SensorData data) {
        return data.isMotionDetected();
    }
    public void execute() {
        light.turnOn();
    }
}
class TemperatureACRule implements Rule {
    private Device ac;
    public TemperatureACRule(Device ac) {
        this.ac = ac;
    }
    public boolean evaluate(SensorData data) {
        return data.getTemperature() > 30;
    }
    public void execute() {
        ac.turnOn();
    }
}
class TimeLightRule implements Rule {
    private Device light;
    public TimeLightRule(Device light) {
        this.light = light;
    }
    public boolean evaluate(SensorData data) {
        return data.getHour() == 19;
    }
    public void execute() {
        light.turnOn();
    }
}
class RuleEngine {
    private List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }
    public void process(SensorData data) {
        for (Rule rule : rules) {
            if (rule.evaluate(data)) {
                rule.execute();
            }
        }
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        Device livingRoomLight = new Light("Living Room");
        Device bedroomAC = new AC("Bedroom");
        RuleEngine engine = new RuleEngine();
        engine.addRule(new MotionLightRule(livingRoomLight));
        engine.addRule(new TemperatureACRule(bedroomAC));
        engine.addRule(new TimeLightRule(livingRoomLight));
        SensorData data = new SensorData(true, 32, 19);
        engine.process(data);
    }
}