package Design.reflection;

public class Office {

    public static void main(String[] args) {
        try {

            Class c = Class.forName(args[0]);
            OfficeAble oa = (OfficeAble) c.newInstance();
            oa.start();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
