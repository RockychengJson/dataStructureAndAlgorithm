package linerList.linkedListExample;

/**
 * 单链表的定义
 */
public class LinkList {
    private LNode head;

    /**
     * 尾插法建立单链表
     *
     * @param array
     * @param flag
     */
    public LinkList(int[] array, int flag) {
        this.head = new LNode();
        LNode tail = head;
        for (int i = 0; i < array.length; i++) {
            LNode newNode = new LNode(array[i]);
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
    }
}
