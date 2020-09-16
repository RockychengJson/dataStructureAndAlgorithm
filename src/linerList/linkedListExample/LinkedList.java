package linerList.linkedListExample;

/**
 * 带头结点的单链表
 *
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> {
    private LNode<T> head;


    /**
     * 初始化只包含头结点的单链表
     */
    public LinkedList() {
        this.head = new LNode<T>();
    }

    /**
     * 头插法建立单链表
     *
     * @param array
     */
    public LinkedList(T[] array) {
        this();
        for (int i = 0; i < array.length; i++) {
            LNode newNode = new LNode(array[i]);
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    /**
     * 尾插法建立单链表
     *
     * @param array
     * @param flag
     */
    public LinkedList(T[] array, int flag) {
        this();
        LNode p = new LNode();
        p = head;
        for (int i = 0; i < array.length; i++) {
            LNode newNode = new LNode(array[i]);
            newNode.next = null;
            p.next = newNode;
            p = newNode;
        }
    }


    /**
     * 清空单链表，释放链表空间
     */
    public void clear() {
        head.next = null;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return head.next == null;
    }

    /**
     * 求单链表的长度
     *
     * @return
     */
    public int length() {
        LNode<T> p = head.next;
        int length = 0;
        while (p != null) {
            length++;
            p = p.next;
        }
        return length;
    }

    /**
     * 插入一个值为x的结点
     *
     * @param x
     */
    public void insert(T x) {
        LNode<T> newNode = new LNode<>();
        newNode.value = x;
        newNode.next = head.next;
        head.next = newNode;
    }

    /**
     * 在单链表的第i个节点前，插入值为X的结点
     *
     * @param i
     * @param x
     * @return
     */
    public int insertAt(int i, T x) {
        if (i < 1) {
            System.out.println("illegal position!");
            return -1;
        }
        int j = 0;
        LNode<T> p = head;
        while (p != null && j < i - 1) {
            p = p.next;
            j++;
        }
        if (p != null) {
            LNode<T> newNode = new LNode<>(x);
            newNode.next = p.next;
            p.next = newNode;
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * 删除单链表中某结点的后继结点
     *
     * @param p
     */
    public void remove(LNode p) { //删除p的后继结点
        LNode q;
        if (p.next != null) {
            q = p.next;          //q为p的直接后继
            p.next = q.next;   //删除q
            q = null;        //释放q结点空间
        }
    }

    /**
     * 删除链表中值为value的结点
     *
     * @param value
     * @return
     * @throws Exception
     */
    public boolean removeByValue(T value) {
        LNode<T> p = head;
        boolean flag = false;
        while (p.next != null) {
            if (p.next.value == value) {
                p.next = p.next.next;
                flag = true;
                break;
            } else {
                p = p.next;
            }
        }
        return flag;
    }


    /**
     * 查找值为value的结点
     *
     * @param value
     * @return
     */
    public LNode<T> find(T value) {
        LNode<T> p = head.next;
        while (p != null && p.value != value) {
            p = p.next;
        }
        return p;
    }

    /**
     * 读取单链表中的第i个元素
     *
     * @param i
     * @return
     */
    public LNode get(int i) {
        LNode p = head.next;
        int j = 1;
        while (p != null && j < i) {   //移动指针p，直到p为空或p指向第i个元素
            p = p.next;
            j++;
        }
        if (i == j)
            return p;   //返回第i个元素的存储地址
        else
            return null;
    }


    /**
     * 打印出所有的链表元素
     */
    public void display() {
        LNode<T> p = head;
        System.out.println("Print out the elements of the linked list");
        while (p.next != null) {
            System.out.print(p.next);
            p = p.next;
        }
        System.out.println();
    }


    /**
     * 单循环链表中查找算法：
     *
     * @param x
     * @return
     */
    public LNode get(T x) {
        LNode p = head.next;
        while (p != head && x != p.value) //循环扫描查找，直到p 指向头结点h 或找到x结束
            p = p.next;
        if (p == head)
            return null;
        return p;
    }

    /**
     * 单链表反向
     * 思想：将单链表中的结点按照头插法挨个插入新的单链表中
     *
     * @return 新单链表的头结点
     */
    public LNode reverse() {
        if (head.next == null || head.next.next == null)
            return head;
        LNode s = head, newHead = head.next, p;
        while (newHead != null) {
            p = newHead;
            newHead = newHead.next;
            p.next = s.next;
            s.next = p;
        }
        return s;
    }

    /**
     * 带头结点的有序单链表的合并
     * 从小到大排列
     *
     * @param headA
     * @param headB
     * @return 新单链表的头结点
     */
//    public LNode merge(LNode headA, LNode headB) {
//        LNode head = new LNode();
//        LNode p = head;
//        headA = headA.next;
//        headB = headB.next;
//        while (headA != null && headB != null) {
//            LNode newNode = new LNode();
//            if (headA.value.compareTo(headB.value) < 0) {
//                newNode.value = headA.value;
//                headA = headA.next;
//            } else {
//                newNode.value = headB.value;
//                headB = headB.next;
//            }
//            newNode.next = p.next;
//            p.next = newNode;
//        }
//        while(headA != null){
//            LNode newNode = new LNode();
//            newNode.value = headA.value;
//            headA = headA.next;
//
//        }
//    }

}
