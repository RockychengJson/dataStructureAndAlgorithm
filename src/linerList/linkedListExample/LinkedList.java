package linerList.linkedListExample;

/**
 * 带头结点的单链表
 */
public class LinkedList {
    private LNode head;


    /**
     * 初始化只包含头结点的单链表
     */
    public LinkedList() {
        this.head = new LNode();
    }

    /**
     * 头插法建立单链表
     *
     * @param array
     */
    public LinkedList(int[] array) {
        this.head = new LNode();
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
    public LinkedList(int[] array, int flag) {
        this.head = new LNode();
        LNode tail = head;
        for (int i = 0; i < array.length; i++) {
            LNode newNode = new LNode(array[i]);
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
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
        LNode p = head.next;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * 插入一个值为x的结点
     *
     * @param x
     */
    public void insert(int x) {
        LNode newNode = new LNode();
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
    public boolean insertAt(int i, int x) {
        if (i < 1) {
            System.out.println("illegal position!");
            return false;
        }
        //查找第i-1个节点
        int j = 0;
        LNode p = head;
        while (p != null && j < i - 1) {
            p = p.next;
            j++;
        }
        //插入值为X的新结点
        if (p != null) {
            LNode newNode = new LNode(x);
            newNode.next = p.next;
            p.next = newNode;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除单链表中某结点的后继结点
     *
     * @param p
     */
    public void remove(LNode p) { //删除p的后继结点
        if (p.next != null) {
            p.next = p.next.next;
        }
    }

    /**
     * 删除链表中值为value的结点
     *
     * @param value
     * @return
     * @throws Exception
     */
    public boolean removeByValue(int value) {
        LNode p = head;
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
     * 查找链表中是否存在值为value的结点
     *
     * @param value
     * @return
     */
    public boolean isExisted(int value) {
        LNode p = head.next;
        while (p != null && p.value != value) {
            p = p.next;
        }
        if (p == null) {
            return false;
        }
        return true;
    }

    /**
     * 读取单链表中的第i个结点
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
     * 打印出单链表的所有结点
     */
    public void show() {
        LNode p = head.next;
        while (p != null) {
            System.out.print(" " + p.value);
            p = p.next;
        }
    }

    /**
     * 单循环链表中查找算法：
     *
     * @param x
     * @return
     */
    public LNode search(int x) {
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
     */
    public void reverse() {
        if (head.next == null || head.next.next == null)
            return;
        LNode tempHead = head.next;
        LNode p;
        head.next = null;
        while (tempHead != null) {
            p = tempHead;
            tempHead = tempHead.next;
            p.next = head.next;
            head.next = p;
        }
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
