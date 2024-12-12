package ru.mirea.prac17_lists.task3_CycledTwoLinked;

public class DoubleLinkedCycleList<T extends Comparable<T>> {
    Node<T> head;
    private int len = 0;


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {
            Node<T> last = head.getPrev();
            newNode.setNext(head);
            newNode.setPrev(last);
            last.setNext(newNode);
            head.setPrev(newNode);
        }
        len++;
    }

    public void bubbleSort() {
        if (head == null) {
            return;
        }


        for (int j = 1; j < len; j++) {
            boolean isSorted = true;
            for (int i = 0; i < len - j; i++) {
                if (getNode(i).compareTo(getNode(i + 1)) > 0) {
                    swapNodes(getNode(i), getNode(i + 1));
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

    }

    private void swapNodes(Node<T> node1, Node<T> node2) {
        Node<T> prev1 = node1.getPrev();
        Node<T> next2 = node2.getNext();

        prev1.setNext(node2);
        next2.setPrev(node1);

        node1.setNext(next2);
        node1.setPrev(node2);

        node2.setPrev(prev1);
        node2.setNext(node1);

        if (node1 == head) {
            head = node2;
        }
    }

    public Node<T> getNode(int id) {
        if (id >= len) {
            return null;
        }
        Node<T> cur = head;
        for (int i = 0; i < id; i++) {
            cur = cur.getNext();
        }
        return cur;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("[");
        if (head == null) {
            return "Список пуст";
        }
        Node<T> cur = head;
        do {
            ans.append(cur.getData().toString()).append(cur != head.getPrev() ? ", " : "]");
            cur = cur.getNext();
        } while (cur != head);
        return ans.toString();
    }
}
