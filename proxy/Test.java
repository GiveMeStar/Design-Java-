package Design.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        InvocationHandler invocationHandler = new TimeHandler(car);

        Class c = car.getClass();

        Moveable m = (Moveable) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), invocationHandler);

        m.move();
        m.say();
    }
}
