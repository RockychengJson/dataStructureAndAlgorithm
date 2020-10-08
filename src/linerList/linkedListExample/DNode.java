package linerList.linkedListExample;

/**
 * 双向链表节点定义
 */
public class DNode {
    int value;
    DNode prior;
    DNode next;

    public DNode() {
    }

    public DNode(int value) {
        this.value = value;
    }
}
