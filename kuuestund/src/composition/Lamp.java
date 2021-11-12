package composition;

public class Lamp {

    private String style;
    private boolean battery;

    public Lamp(String style, boolean battery) {
        this.style = style;
        this.battery = battery;
    }

    public void turnOn() {
        System.out.println("Lamp turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }
}
