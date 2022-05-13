package item24;

import java.util.AbstractSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>();
    }

    @Override
    public int size() {
        return 0;
    }

    // 바깥 클래스에서 참조할 것이 없다면 정적클래스로 선언하자.
    private static class MyIterator<E> implements Iterator<E>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }


}
