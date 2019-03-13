package com.zipcodewilmington.singlylinkedlist;

public class LinkedNode <T> {
     T element;
     LinkedNode next;

     public LinkedNode(T element){
         this.element = element;
     }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
