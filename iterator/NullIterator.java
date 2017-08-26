package Design.iterator;


import java.util.Iterator;

public class NullIterator implements Iterator{

    public Object next() {
        return false;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
