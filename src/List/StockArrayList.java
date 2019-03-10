package List;

import java.util.Arrays;
import java.util.Iterator;

public class StockArrayList<E> implements Iterable<E> {
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;
    private int size = 0;

    public StockArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + 1;
        return newCapacity;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData,
                newCapacity(minCapacity));
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = e;
        size = s + 1;
    }

    public boolean add(E e) {
        add(e, elementData, size);
        return true;
    }

    class Itr implements Iterator<E> {
        int cursor = 0;

        Itr() {}

        public boolean hasNext() {
            return cursor != size;
        }

        public E next() {
            int i = cursor;
            Object[] elementData = StockArrayList.this.elementData;
            cursor = i + 1;
            return (E) elementData[i];
        }
    }

    public Iterator<E> iterator() {
        return new Itr();
    }
}
