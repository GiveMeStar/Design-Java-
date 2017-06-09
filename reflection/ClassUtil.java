package Design.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
    /**
     * 类方法
     * @param obj
     */
    public static void printClassMessage(Object obj) {
        Class c = obj.getClass();
        /**
         * 类中的方法也是Method的实例对象
         * getMethods 方法返回类中所有public方法
         * getDeclaredMethods 返回类中所有自己声明的方法
         */
        Method[] methods = c.getMethods();

        for (Method method:
             methods) {
            Class returnType = method.getReturnType();//得到方法的返回值类型的类类型
            method.getName();//得到方法名称
            Class[] paramType = method.getParameterTypes();//得到参数类型
        }
    }

    /**
     * 类属性
     * @param obj
     */
    public static void printFiledMessage(Object obj) {
        Class c = obj.getClass();

        /**
         * getFields 方法返回类中所有public属性
         * getDeclaredFields 返回类中所有自己声明的属性
         */
        Field[] fields = c.getFields();
        for (Field field:
             fields) {
            Class fieldType = field.getType();//获取属性类类型
            field.getName();//获取属性名称
        }
    }

    /**
     * 类构造函数
     * @param obj
     */
    public static void printConMessage(Object obj) {
        Class c = obj.getClass();

        /**
         * getConstructors 方法返回类中所有public构造函数
         * getDeclaredConstructors 返回类中所有自己声明的构造函数
         */
        Constructor[] cs = c.getConstructors();//获取构造函数
        for (Constructor constructor:
             cs) {
            Class[] paramType = constructor.getParameterTypes();
            //................
        }
    }
}
