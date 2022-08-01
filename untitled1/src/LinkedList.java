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

    public void addLast(int num) {
        var node = new Node(num);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int num) {
        var node = new Node(num);
        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

}
