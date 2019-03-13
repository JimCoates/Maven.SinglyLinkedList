package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    SinglyLinkedList testList;
    @Before
    public void setup() {
        testList = new SinglyLinkedList(1);
    }

    @Test
    public void add() {
        int expected = 4;
        testList.add(2);
        testList.add(3);
        testList.add(4);
        int actual = testList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        testList.add("Dog");
        testList.add("Cat");
        testList.add("Bird");
        testList.add("Cheetah");

        Object expected = testList.getElement(3);

        testList.remove(2);
        Object actual = testList.getNode(2).getElement();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void find() {
        testList.add(2);
        testList.add(3);
        testList.add(4);

        Integer expected = 3;
        Integer actual = testList.find(4);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void size() {
        int expected = 1;
        int actual = testList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getElement() {
        testList.add(2);
        testList.add(3);
        Object expected = 2;
        Object actual = testList.getElement(1);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getNode() {
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);

        Object expected = 4;
        Object actual = testList.getNode(3).getElement();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsTest(){
        testList.add(2);
        testList.add(3);
        testList.add(4);

        Assert.assertFalse(testList.contains(5));
    }

    @Test
    public void containsTest2(){
        testList.add("Dog");
        testList.add("Cat");
        testList.add("Cow");

        Assert.assertTrue(testList.contains("Cat"));
    }

    @Test
    public void copyTest(){
        testList.add("Dog");
        testList.add("Cat");

        SinglyLinkedList copiedList = testList.copy(testList);
        Object expected = testList.getElement(1);
        Object actual = copiedList.getElement(1);

        Assert.assertEquals(expected,actual);

    }
}