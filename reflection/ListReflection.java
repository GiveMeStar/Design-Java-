package Design.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ListReflection {
    public static void main(String[] args) {
        //泛型只会在编译时期报错，在运行时期不会
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
//        list.add(20);

        Class c = list.getClass();
        try {
            Method m = c.getMethod("add", Object.class);
            m.invoke(list, 20);
            System.out.println(list);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
