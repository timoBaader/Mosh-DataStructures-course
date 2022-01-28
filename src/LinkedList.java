import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.value == item) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        // if there is only 1 item in the list
        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        var currentNode = first;
        while(currentNode.next != last) {
            currentNode = currentNode.next;
        }
        last = currentNode;
        last.next = null;

    }

}
