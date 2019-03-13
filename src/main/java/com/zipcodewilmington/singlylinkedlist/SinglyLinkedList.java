package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    LinkedNode node;
    private LinkedNode n1;

    public SinglyLinkedList(T element) {
        node = new LinkedNode(element);
    }

    public SinglyLinkedList() {

    }

    public void add(T element) {
        n1 = node;
        while (n1.getNext() != null) {
            n1 = n1.getNext();
        }
        n1.setNext(new LinkedNode(element));
    }

    public void remove(Integer index) {
        LinkedNode prev = getNode(index - 1);
        prev.setNext(getNode(index + 1));


    }

    public Integer find(T element) {
        n1 = node;
        Integer counter = 1;
        while (n1.getNext().getElement() != element) {
            if (n1.getNext() == null) {
                return -1;
            }
            n1 = n1.getNext();
            counter++;
        }
        return counter;
    }

    public Integer size() {
        n1 = node;
        if (n1 == null) {
            return 0;
        }
        Integer counter = 0;

        while (n1.getNext() != null) {
            n1 = n1.getNext();
            counter++;
        }
        counter++;
        return counter;
    }

    public Object getElement(Integer index) {
        n1 = node;
        Integer counter = 0;

        while (counter != index) {
            n1 = n1.getNext();
            counter++;
        }
        return n1.getElement();
    }

    public LinkedNode getNode(Integer index) {
        n1 = node;
        Integer counter = 0;

        while (counter != index) {
            n1 = n1.getNext();
            counter++;
        }
        return n1;
    }

    public Boolean contains(T element) {
        n1 = node;
        while (n1.getNext().getElement() != element) {
            n1 = n1.getNext();
            if (n1.getNext() == (null)) {
                return false;
            }
        }
        return true;
    }

    public SinglyLinkedList copy(SinglyLinkedList listToCopy){
        SinglyLinkedList answer = new SinglyLinkedList(this.getNode(0));
        for (int i = 1; i < this.size(); i++) {
            answer.add(this.getNode(i).getElement());
        }
        return answer;
    }
}
