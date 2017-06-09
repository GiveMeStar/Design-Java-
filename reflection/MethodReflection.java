package Design.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodReflection {

    public static void main(String[] args) {
        A a1 = new A();
//        Class c = A.class;
        Class c = a1.getClass();
        try {
            Method m1 = c.getMethod("print", new Class[]{String.class, String.class});
//            Method m1 = c.getMethod("print", String.class, String.class);
            //如果没有返回值则返回null，如果有则返回返回值
            m1.invoke(a1, "hello", "world");

            Method m2 = c.getMethod("print");
            m2.invoke(a1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void print() {
        System.out.println("hello world");
    }

    public void print(String a, String b) {
        System.out.println(a.toLowerCase() + "," + b.toUpperCase());
    }

    public void print(int a, int b) {
        System.out.println(a + b);
    }
}
