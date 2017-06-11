package Design.module;

public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        concreteOperation();
        hook();
        //钩子的存在可以让子类有能力对算法的不同挂钩
        if (customerWantsCondiments()) {
            primitiveOperation2();
        }
    }
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    /**
     * 有超类实现的方法，最好声明为final
     */
    final void concreteOperation() {
        //这里是实现
    }
    /**
     * 钩子，子类可以视情况决定要不要覆盖它们
     */
    void hook() {}
    boolean customerWantsCondiments() {
        return true;
    }
}
