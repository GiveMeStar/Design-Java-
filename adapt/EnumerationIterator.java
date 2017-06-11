package Design.adapt;

import java.util.Enumeration;
import java.util.Iterator;

/**
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
