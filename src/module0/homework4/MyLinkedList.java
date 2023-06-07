package module0.homework4;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void add(T value) {
        Node<T> node;
        if(first == null) {
            node = new Node<>(value, null, null);
            first = node;
        } else {
            node = new Node<>(value, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value,first, null);
        node.next = first;
        first.prev = node;
        first = node;
        size++;
    }

    public void addLast(T value) {
        Node<T> node = new Node<>(value, null, last);
        node.prev = last;
        last.next = node;
        last = node;
        size++;
    }

    public T get(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("индекс больше размера списка");
        }
        Node<T> curr = first;
        int count = 0;

        while (curr != null) {
            if(count == index) {
                return curr.value;
            }
            curr = curr.next;
            count++;
        }
        return null;
    }


    public void delete(int index) {
//        if(index > size) {
//            throw new IndexOutOfBoundsException("индекс больше размера списка");
//        }
//        if(index == 0) {
//            first = first.next;
//            size--;
//            return;
//        }
//        if(index == size) {
//            last = last.prev;
//            size--;
//            return;
//        }
//        Node<T> curr = first;
//        Node<T> prev = null;
//        int count = 0;
//
//        while (count < index) {
//            prev = curr;
//            curr = curr.next;
//            count++;
//        }
//        prev.next = prev.next.next;
//
//        size--;

        Node<T> curr = first;
        Node<T> prev = null;

        if(index == 0) {
            first = first.next;
            size--;
            return;
        }

        int count = 0;
        while (count < index) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if(curr != null) {
            prev.next = curr.next;
        }
        size--;
    }

    private Node<T> getNodeByIndex(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("индекс больше размера списка");
        }
        Node<T> curr = first;
        int count = 0;

        while (curr != null) {
            if(count == index) {
                return curr;
            }
            curr = curr.next;
            count++;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public T getFirstValue() {
        return first.value;
    }

    public T getLastValue() {
        return last.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> curr = first;
            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                Node<T> tmp = curr;
                curr = curr.next;
                return tmp.value;
            }
        };
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
