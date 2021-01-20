package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedList {
    private Node head;
    private int realSize = 0;

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        Node prevNode = head;
        int curIndex = 0;
        while (curIndex < realSize) {
            if (o.equals(prevNode.getValue())) {
                return true;
            }
            prevNode = prevNode.getNext();
            curIndex++;
        }
        return false;
    }

    public boolean add(Object o) {
        Node node = new Node(o, null);
        if (head == null) {
            head = node;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        realSize++;
        return true;
    }

    public boolean remove(Object o) {
        Node prevNode = head;
        int curIndex = 0;
        int count;
        while (curIndex < realSize) {
            if (o.equals(prevNode.getValue())) {
                count = curIndex;
                remove(count);
                return true;
            }
            prevNode = prevNode.getNext();
            curIndex++;
        }
        return false;
    }

    public void clear() {
        head = null;
        realSize = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            Node prevHead = head;
            // head = head.getNext();
            return prevHead.getValue();
        }
        Node prevNode = head;
        Node curNode = head.getNext();
        int curIndex = 1;
        while (curIndex != index) {
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node node = new Node(element, null);
        Node curNode = head;
        Node nextNode = head.getNext();
        if (index == 0) {
            Node oldHead = head;
            head = node;
            node.setNext(oldHead.getNext());
            return oldHead.getValue();
        } else {
            int listIndex = 1;
            while (curNode != null) {
                if (index == listIndex) {
                    curNode.setNext(node);
                    node.setNext(nextNode.getNext());
                    break;
                }
                nextNode = nextNode.getNext();
                curNode = curNode.getNext();
                listIndex++;
            }
        }
        return nextNode.getValue();
    }

    public void add(int index, Object element) {
        checkIndex(index);
        Node node = new Node(element, null);
        if (index == 0) {
            Node oldHead = head;
            head = node;
            node.setNext(oldHead);
            realSize++;
        } else {
            int listIndex = 1;
            Node curNode = head;
            Node nextNode = head.getNext();
            while (curNode != null) {
                if (index == listIndex) {
                    curNode.setNext(node);
                    node.setNext(nextNode);
                    realSize++;
                    break;
                }
                nextNode = nextNode.getNext();
                curNode = curNode.getNext();
                listIndex++;
            }
        }
    }

    private void checkIndex(int index) {
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }

    }

    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) {
            Node prevHead = head;
            head = head.getNext();
            prevHead.setNext(null);
            realSize--;
            return prevHead.getValue();
        }
        Node prevNode = head;
        Node curNode = head.getNext();
        int curIndex = 1;
        while (curIndex != index) {
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        realSize--;
        return curNode.getValue();
    }

    public int indexOf(Object o) {
        Node prevNode = head;
        Node curNode = head.getNext();
        int curIndex = 1;
        int count = -1;
        if (o.equals(prevNode.getValue()))
            return 0;
        while (curIndex < realSize) {
            if (o.equals(curNode.getValue())) {
                count = curIndex;
                break;
            }
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }
        return count;
    }

    public int lastIndexOf(Object o) {
        Node prevNode = head;
        int curIndex = 0;
        int count = -1;
        while (curIndex < realSize) {
            if (o.equals(prevNode.getValue())) {
                count = curIndex;
            }
            prevNode = prevNode.getNext();
            curIndex++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkedList{ ");
        Node curNode = head;
        while (curNode != null) {
            stringBuilder.append(curNode.getValue()).append(" ");
            curNode = curNode.getNext();
        }
        return stringBuilder.append('}').toString();
    }
}
