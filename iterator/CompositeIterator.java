package Design.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else return null;
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            //是否还有下一个元素，如果有直接换回true，如果没有，则弹出堆栈，然后递归调用hasNext()
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
