package Design.proxy;

public class Car implements Moveable{

    @Override
    public void move() {
        System.out.println("行驶中");
    }

    public void say() {
        System.out.println("说话");
    }
}
