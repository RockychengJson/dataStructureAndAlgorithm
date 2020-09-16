package linerList.linkedListExample;

/**
 * 双向循环链表的实现
 */
public class DCLinkedList<T> {
    private DNode<T> head;


    /**
     * 在第index个结点前插入值为value的新结点
     *
     * @param index
     * @param value
     * @return
     */
    public int insert(int index, T value) {
        DNode p = head.next;
        int j = 1;
        //查找第index个元素,直到p指向头结点h或p指向第i个元素结束
        while (p != head && j < index) {
            j++;
            p = p.next;
        }
        if (j == index) {
            DNode newNode = new DNode();
            newNode.value = value;
            newNode.prior = p.prior;
            p.prior.next = newNode;
            newNode.next = p;
            p.prior = newNode;
            return 1;
        } else
            return 0;
    }


    /**
     * 双向循环链表的删除算法
     * 删除第i个结点p
     *
     * @param i
     * @return  被删除的结点的值
     */
    public T delete(int i) {
        DNode p = head.next;
        int j = 1;
        while (p != head && j < i) {      //在双向链表中依次查找第i个元素
            j++;
            p = p.next;
        }
        if (j == i) {
            T value = (T) p.value;
            p.prior.next = p.next;      //删除结点p
            p.next.prior = p.prior;
            p = null;          //释放p结点空间
            return value;
        } else
            return null;
    }


}
