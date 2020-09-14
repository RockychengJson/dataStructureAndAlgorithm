package linerList.linkedListExample;

/**
 * 双向链表节点定义
 *
 * @param <T>
 */
public class DNode<T> {
    T value;
    DNode prior;
    DNode next;

    public DNode() {
    }

    public DNode(T value) {
        this.value = value;
    }
}
