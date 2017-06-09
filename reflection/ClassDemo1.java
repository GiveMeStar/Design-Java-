package Design.reflection;

public class ClassDemo1 {

    public static void main(String[] args) {

        Foo foo1 = new Foo();

        //任何一个类都是Class的实例对象，这个实例对象有三种表达方式
        //1.任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;
        //2.已知该类的对象，通过getClass方法
        Class c2 = foo1.getClass();
        /**
         * c1 c2 表示了Foo类的类类型（class type）
         * 类也是对象，是Class实例的对象
         * 这个对象我们称为类类型
         */

        //3.第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("Design.reflection.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //可以通过类类型创建类的实例对象
        try {
            Foo foo = (Foo) c3.newInstance();//需要有无参数构造方法
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

class Foo{
    void print() {
        System.out.print("Foo");
    }
}
