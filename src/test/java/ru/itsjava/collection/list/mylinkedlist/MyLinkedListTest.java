package ru.itsjava.collection.list.mylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс LinkedList должен:")
public class MyLinkedListTest {

    public static final String ELEM_1 = "Elem 1";
    public static final String ELEM_2 = "Elem 2";

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        int sizeBeforeRemove = list.size();
        list.remove(ELEM_1);
        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }

    @DisplayName(" корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectAddElement() {
        MyLinkedList list = new MyLinkedList();
        int sizeBeforeAdd = list.size();
        list.add(ELEM_1);
        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());

    }

    @DisplayName(" иметь корректный isEmpty")
    @Test
    public void shouldHaveCorrectIsEmpty() {
        MyLinkedList list = new MyLinkedList();
        Assertions.assertEquals(true, list.isEmpty());
    }

    @DisplayName(" иметь корректный contains")
    @Test
    public void shouldHaveCorrectContains() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        Assertions.assertEquals(true, list.contains(ELEM_1));
    }

    @DisplayName(" иметь корректный clear")
    @Test
    public void shouldHaveCorrectClear() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        list.add(ELEM_2);
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @DisplayName(" иметь корректный getIndex")
    @Test
    public void shouldHaveCorrectGetIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        Assertions.assertEquals(ELEM_1,list.get(0));
    }

    @DisplayName(" корректно заменять элемент в указанной позиции")
    @Test
    public void shouldHaveCorrectSetElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        list.add(ELEM_1);
        list.add(ELEM_2);

        list.set(2, ELEM_2);
        Assertions.assertEquals(ELEM_2, list.get(2));
    }

    @DisplayName(" корректно добавлять элемент по индексу")
    @Test
    public void shouldHaveCorrectAddElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(0, ELEM_1);
        Assertions.assertEquals(ELEM_1, list.get(0));
    }

    @DisplayName(" корректно удалять элемент по индексу")
    @Test
    public void shouldHaveCorrectRemoveByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        int sizeBeforeRemove = list.size();
        list.remove(0);
        Assertions.assertEquals(sizeBeforeRemove-1, list.size());
    }

    @DisplayName(" иметь корректный indexOf")
    @Test
    public void shouldHaveCorrectIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        list.add(ELEM_2);
        list.add(ELEM_1);
        Assertions.assertEquals(1, list.indexOf(ELEM_2));
    }

    @DisplayName(" иметь корректный lastIndexOf")
    @Test
    public void shouldHaveCorrectLastIndexOf() {
        MyLinkedList list = new MyLinkedList();
        list.add(ELEM_1);
        list.add(ELEM_2);
        list.add(ELEM_2);
        list.add(ELEM_1);
        Assertions.assertEquals(2, list.lastIndexOf(ELEM_2));
    }
}