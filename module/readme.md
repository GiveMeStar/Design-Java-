## 模块方法模式

#### 定义：*在一个方法中定义一个算法骨架，而将一些步骤延迟到子类中。模块方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤*

![image](https://thumbnail0.baidupcs.com/thumbnail/ab36a38374a2db9a5069390dc655e1cf?fid=52782990-250528-650169497927194&time=1497146400&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-OlOWmXMm%2BhYG9FyoejbeaiQVW%2BY%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=3744033246247396128&dp-callid=0&size=c710_u400&quality=100&vuk=-&ft=video)

### 模块方法的有点以及应用场景

- 容易扩展。一般来说，抽象类中的模版方法是不易反生改变的部分，而抽象方法是容易反生变化的部分，因此通过增加实现类一般可以很容易实现功能的扩展，符合开闭原则。

- 便于维护。对于模版方法模式来说，正是由于他们的主要逻辑相同，才使用了模版方法，假如不使用模版方法，任由这些相同的代码散乱的分布在不同的类中，维护起来是非常不方便的。

- 比较灵活。因为有钩子方法，因此，子类的实现也可以影响父类中主逻辑的运行。但是，在灵活的同时，由于子类影响到了父类，违反了里氏替换原则，也会给程序带来风险。这就对抽象类的设计有了更高的要求。

- 在多个子类拥有相同的方法，并且这些方法逻辑相同时，可以考虑使用模版方法模式。在程序的主框架相同，细节不同的场合下，也比较适合使用这种模式。

### 代码

```java
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
```

### 好莱坞原则

    允许底层组件将自己挂钩到系统上，但是高层组件会决定什么时候和怎样使用这些底层组件。换句话说，高层组件对待底层组件的方式是“别调用我们，我们会调用你”