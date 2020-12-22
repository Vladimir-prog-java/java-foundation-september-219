package ru.itsjava.collection.list.myarraylist;

import ru.itsjava.object.TelephoneShop;

public class MyArrayList {
    private final static int DEFAULT_CAPACITY = 10;

    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;

        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                break;
            }
            resultArray[i] = array[i];
        }
        if (removeIndex == realSize) {
            return false;
        }
        for (int i = removeIndex; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;


    }

    public void clear() {
        Object[] clearArray = new Object[realSize];
        array = clearArray;

    }

    private void checkIndex(int index) {
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }

    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[index] = element;
        return array;
    }

    public void add(int index, Object element) {
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        } else if (array[index] != null) {
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    realSize++;
                    for (int j = realSize - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = element;
                    i++;
                }
            }
        } else array[index] = element;
    }

    public Object remove(int index) {
        Object[] resultArray = new Object[realSize];
        if (index == realSize) {
            return false;

        }
        for (int i = 0; i < realSize; i++) {
            resultArray[i] = array[i];
            if (i == index) {
                resultArray[i] = array[i + 1];
                i++;
                for (int j = i; j < realSize - 1; j++) {
                    resultArray[j] = array[j + 1];
                }
                break;
            }
        }
        array = resultArray;
        realSize--;
        return array;
    }


    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = realSize-1; i >= 0; i--) {
            if (array[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result.append(array[i]).append(" ");
        }
        result.append('}');
        return result.toString();
    }
}
