package linerList.linkedListExample;

public class TestLinkedList {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 89, 56, 45, 78};
//        //头插法演示
//        LinkedList headLinkList = new LinkedList(array);
//        headLinkList.show();

        //尾插法演示
        LinkedList tailLinkList = new LinkedList(array, 1);
        tailLinkList.show();
        System.out.println();

        tailLinkList.reverse();
        tailLinkList.show();

//
        //获取单链表长度演示
//        int length = tailLinkList.length();
//        System.out.println("the length of the linked list is:" + length);
//
//        boolean find45 = tailLinkList.isExisted(45);
//        boolean find100 = tailLinkList.isExisted(100);
//        System.out.println("45 exists in linked list:" + find45);
//        System.out.println("100 exists in linked list:" + find100);
//
//
//        //单链表插入演示
//        tailLinkList.insert(1000);
//        tailLinkList.show();
//
//        //单链表按位置插入演示
//        tailLinkList.insertAt(4,3000);
//        tailLinkList.show();
//
//        //单链表删除演示
//        boolean flag = tailLinkList.removeByValue(1000);
//        System.out.println("remove node of value successfully :" + flag);
//        tailLinkList.show();

    }

    /**
     * 顺序表的逆置
     *
     * @param array
     * @param n
     */
    void inverse(int[] array, int n) {
        int temp;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

}
