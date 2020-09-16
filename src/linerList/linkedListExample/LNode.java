package linerList.linkedListExample;

public class LNode<T extends Comparable<T>> {
    T value;
    LNode<T> next;

    LNode() {
    }

    LNode(T value) {
        this.value = value;
    }
}
