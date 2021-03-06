package ru.itsjava.collection.list.myarraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyArrayList должен:")
public class MyArrayListTest {

    public static final String ELEM_1 = "Elem 1";
    public static final String ELEM_2 = "Elem 2";

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        int sizeBeforeRemove = list.size();
        list.remove(ELEM_1);
        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }

    @DisplayName(" корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectAddElement() {
        MyArrayList list = new MyArrayList();
        int sizeBeforeAdd = list.size();
        list.add(ELEM_1);
        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());

    }

    @DisplayName(" иметь корректный isEmpty")
    @Test
    public void shouldHaveCorrectIsEmpty() {
        MyArrayList list = new MyArrayList();
        Assertions.assertEquals(true, list.isEmpty());
    }

    @DisplayName(" иметь корректный contains")
    @Test
    public void shouldHaveCorrectContains() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        Assertions.assertEquals(true, list.contains(ELEM_1));
    }

    @DisplayName(" иметь корректный clear")
    @Test
    public void shouldHaveCorrectClear() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        list.clear();
        Assertions.assertEquals(null, list.get(0));
    }

    @DisplayName(" иметь корректный getIndex")
    @Test
    public void shouldHaveCorrectGetIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        Assertions.assertEquals(ELEM_1,list.get(0));
    }

    @DisplayName(" корректно заменять элемент в указанной позиции")
    @Test
    public void shouldHaveCorrectSetElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.set(0, ELEM_1);
        Assertions.assertEquals(ELEM_1, list.get(0));

    }

    @DisplayName(" корректно добавлять элемент по индексу")
    @Test
    public void shouldHaveCorrectAddElementByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(0, ELEM_1);
        Assertions.assertEquals(ELEM_1, list.get(0));
    }

    @DisplayName(" корректно удалять элемент по индексу")
    @Test
    public void shouldHaveCorrectRemoveByIndex() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
       int sizeBeforeRemove = list.size();
        list.remove(0);
        Assertions.assertEquals(sizeBeforeRemove-1, list.size());
    }

    @DisplayName(" иметь корректный indexOf")
    @Test
    public void shouldHaveCorrectIndexOf() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        list.add(ELEM_2);
        list.add(ELEM_1);
        Assertions.assertEquals(1, list.indexOf(ELEM_2));
    }

    @DisplayName(" иметь корректный lastIndexOf")
    @Test
    public void shouldHaveCorrectLastIndexOf() {
        MyArrayList list = new MyArrayList();
        list.add(ELEM_1);
        list.add(ELEM_2);
        list.add(ELEM_2);
        list.add(ELEM_1);
        Assertions.assertEquals(2, list.lastIndexOf(ELEM_2));
    }

}