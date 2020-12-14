package ru.itsjava.collection.list.mylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collection.list.myarraylist.MyArrayList;

@DisplayName("Класс LinkedList должен:")
public class MyLinkedListTest {

    public static final String ELEM_1 = "Elem 1";

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
}