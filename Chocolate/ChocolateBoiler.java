package Design.Chocolate;

public class ChocolateBoiler {
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {}

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }


}
