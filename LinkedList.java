package DEV120_1_5_Tekiev;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>  {

    private Node head;

    public void addFirst(T data) {            // метод добавляет значение в начало списка

        Node node = new Node();

        node.next = head;

        node.prev = null;

        if (head != null) {

            head.prev = node;
        }


        head = node;
        head.data = data;
    }

    public T getHead() {        // метод извлекает значение из начала списка без его удаления из списка

        if (head != null) {

            return head.data;

        }

        throw new NullPointerException("Список пуст");

    }

    public T getHeadAndDelete() { // метод извлекает значение из начала списка с его удалением из списка


        if (head != null) {

            Node tmpHead = head;
            head = head.next;
            return tmpHead.data;

        }

        throw new NullPointerException("Список пуст");

    }

    public void addEnd(T data) {          // метод добавляет значение в конец списка

        Node node = new Node();

        Node current = head;


        if (head == null) {

            head = node;
            head.data = data;
            return;
        }

        while (current.next != null) {

            current = current.next;

        }

        current.next = node;

        node.prev = current;

        current.next.data = data;

    }

    public T getLast() { // метод извлекает значение из конца списка без его удаления из списка

        Node current = head;

        while (current.next != null) {

            current = current.next;
        }

        return current.data;

    }

    public T getLastAndDelete() { // метод извлекает значение из конца списка с его удалением из списка

        Node tmpLast;

        Node temp = head;

        Node current = head;


        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;

        tmpLast = current.next;

        current.next = null;

        return tmpLast.data;

    }

    public void printForEachStraight () { // метод для перебора значений в прямом порядке

        for(T data : this)
        {
            System.out.println(data);

        }

    }

    public void printForEachReverse () { // метод для перебора значений в обратном порядке


        ArrayList<T> tmp = new ArrayList<>();

        for(T data : this)
        {
            tmp.add(data);

        }

        for (int i = tmp.size()-1; i >=0; i--) {

            System.out.println(tmp.get(i));

        }

    }

    public void printHeadToKey(T key) {   // переборка и печать элементов с помощью цикла forEach с головного до определенного


        if (key != null) {

            for (T data : this) {
                if (key != data) {
                    System.out.println(data);
                }

                else {
                    break;
                }
            }

        }

    }



    public void printEndToKey(T key) {   // переборка и печать элементов с помощью цикла forEach с хвостового до определенного


        if (key != null) {

            ArrayList<T> tmp = new ArrayList<>();

            for (T data : this) {
                tmp.add(data);

            }

            for (int i = tmp.size() - 1; i >= 0; i--) {

                if (tmp.get(i) != key) {

                    System.out.println(tmp.get(i));

                } else {
                    break;
                }

            }
        }

    }

    public void printFromKeyToEnd(T key) {   // переборка и печать элементов с помощью цикла forEach после определенного если этот элемент есть в списке

        if (key != null) {

            Node current = head;

            while ((current) != null) {

                if (current.data == key) {

                    for (T data : this) {

                        if (data == key){

                            Node tmp = current.next;

                            while ((tmp) != null) {

                                System.out.println(tmp.data);
                                tmp = tmp.next;

                            }
                        }
                    }
                }
                current = current.next;
            }
        }
    }

    public void printFromKeyToHead(T key) {   // переборка и печать элементов с помощью цикла forEach от узла с заданным значением до начала списка если этот элемент есть в списке

        if (key != null) {

            ArrayList<T> tmp = new ArrayList<>();

            for (T data : this) {
                tmp.add(data);

            }

            for (int i = tmp.size() - 1; i >= 0; i--) {

                if (tmp.get(i) == key) {

                    for (int j = i; j >= 0; j--) {

                        System.out.println(tmp.get(j));

                    }

                }

            }

        }
    }


    public void printAll() {

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    @Override
    public Iterator iterator() {
        return new MyIterator(head);
    }


    private class MyIterator implements Iterator {
        private Node current;

        MyIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }


    }

    public class Node {
        T data;
        Node prev;
        Node next;

        @Override
        public String toString() {
            return "" + data;
        }
    }
}
