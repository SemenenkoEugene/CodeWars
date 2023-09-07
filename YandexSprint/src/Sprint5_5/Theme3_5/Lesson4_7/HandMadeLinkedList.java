package Sprint5_5.Theme3_5.Lesson4_7;

import java.util.NoSuchElementException;

public class HandMadeLinkedList<T> {
    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element) {
        final Node<T> oldHead = head;
        final Node<T> newNode = new Node<>(null, element, oldHead);
        head = newNode;
        if (oldHead == null)
            tail = newNode;
        else
            oldHead.prev = newNode;
        size++;
        /*
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
         */
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data;
        /*
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
         */
    }

    public void addLast(T element) {
        // Реализуйте метод
        final Node<T> oldTail = tail;
        final Node<T> newNode = new Node<>(oldTail, element, null);
        tail = newNode;
        if (oldTail == null) {
            head = newNode;
        } else {
            oldTail.next = newNode;
        }
        size++;
        /*
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
         */
    }

    public T getLast() {
        // Реализуйте метод
        final Node<T> curTail = tail;
        if (curTail==null){
            throw new NoSuchElementException();
        }
        return curTail.data;
        /*
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
         */
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        HandMadeLinkedList<Integer> integers = new HandMadeLinkedList<>();

        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addLast(4);
        integers.addLast(5);
        integers.addFirst(1);

        System.out.println(integers.getFirst());
        System.out.println(integers.size());
        System.out.println(integers.getLast());
        System.out.println(integers.size());
    }
}
