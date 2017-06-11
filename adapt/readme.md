# 适配器模式

#### 定义：*适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器将原本接口不兼容的类可以合作无间*

### 两种适配方式
- 类适配方式(使用继承方式)  ++类适配器采用多重继承，一般java不推荐这么做++
```
sequenceDiagram
        Client->>Iterator class: 客户认为正在和Iterator类沟通
        EnumerationIterator->>Iterator class: 继承Iterator类
        EnumerationIterator->>Enumeration: 扩展两个类满足客户需求
        Client->>EnumerationIterator: 客户使用的类
```
- 对象适配方式

```
sequenceDiagram
        Client->>Iterator interface: 客户认为正在和Iterator类沟通
        EnumerationIterator-->>Iterator interface: 实现Iterator接口
        EnumerationIterator->>Enumeration: 实现了Iterator接口但是收到方法调用时会委托给Enumeration
        Client->>EnumerationIterator: 客户使用的类
```

```java
/**
 * 对象适配模式
 * 使用适配器Iterator接口转换为Enumeration
 */
public class EnumerationIterator implements Iterator{
    Enumeration Enum;
    public EnumerationIterator(Enumeration Enum) {
        this.Enum = Enum;
    }
    public boolean hasNext() {
        return Enum.hasMoreElements();
    }
    public Object next() {
        return Enum.nextElement();
    }
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
```

### 适配模式应用场景
- 想要使用一个已经存在的类，但是它却不符合现有的接口规范，导致无法直接去访问，这时创建一个适配器就能间接去访问这个类中的方法。
- 我们有一个类，想将其设计为可重用的类（可被多处访问），我们可以创建适配器来将这个类来适配其他没有提供合适接口的类。

## 外观模式
#### 定义：*提供一个统一的接口，用来访问子系统中的一群接口。外观模式定义了一个高级接口，让子系统更容易使用*

### 设计原则 最少知识原则
    不要让太多的类耦合在一起，免得修改系统中的一部分，会影响到其他部分
#### 对象方法内，我们只应该调用属于以下范围的方法
- 该对象本身
- 被当做方法的参数而传递进来的对象
- 此方法所创建或实例化的任何对象 （以上方针告诉我们，如果某对象是调用其他方法的返回结果，不要调用该对象的方法）
- 对象的任何组件