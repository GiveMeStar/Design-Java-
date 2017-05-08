package Design.Command;

public class Light {

    public String name;

    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void on() { System.out.print("on"); }

    public void off() { System.out.print("down"); }
}
