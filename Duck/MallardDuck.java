package Design.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() { System.out.println("i can display"); }

    public static void main(String args[]) {
        MallardDuck temp = new MallardDuck();
        temp.swim();
        temp.performQuack();
        temp.setQuackBehavior(new Squeak());
        temp.performQuack();
    }
}

