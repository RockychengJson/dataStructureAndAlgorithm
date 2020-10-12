
import java.util.*;

public class Jiajun {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test1 t=new Test1();
        t.test();

    }

}

class Test1 {
    public void test() {
        boolean state = true;
        int n;
        int number;
        String name;
        int great;
        String choose;

        String temp;

        Link link = new Link();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字母  表示你接下来的操作");
        System.out.println("a为顺序添加元素\ns为输出展示所以元素\nd为删除指定元素\nc为查询指定元素\nch为改变元素内容\nab为按序添加\ng为返回元素个数e为退出程序");
        while (state) {
            System.out.println("请输入字母操作，回车表示输入完成");

            choose = sc.nextLine();

            switch (choose.replace("\n", "")) {
                case "a":
                    System.out.println("请输入序号，大于0的正整数");
                    number = sc.nextInt();

                    System.out.println("请输入姓名");
                    name = sc.next();

                    System.out.println("请输入成绩");
                    great = sc.nextInt();

                    link.add(name, number, great);
                    System.out.println("添加成功");
                    break;
                case "s":
                    link.show();
                    break;
                case "d":
                    System.out.println("请输入你要删除数据的序号");
                    n = sc.nextInt();
                    temp = sc.next();
                    link.deleat(n);
                    break;
                case "c":
                    System.out.println("请输入你要查询数据的序号");
                    n = sc.nextInt();
                    temp = sc.next();
                    link.check(n);
                    break;
                case "ch":
                    System.out.println("请输入你要修改的数据的序号");
                    n = sc.nextInt();
                    temp = sc.next();
                    System.out.println("请输入序号，大于0的正整数");
                    number = sc.nextInt();
                    temp = sc.next();
                    System.out.println("请输入姓名");
                    name = sc.nextLine();
                    temp = sc.next();
                    System.out.println("请输入成绩");
                    great = sc.nextInt();
                    temp = sc.next();
                    link.change(n, number, name, great);
                    break;
                case "ab":
                    System.out.println("请输入序号，大于0的正整数");
                    number = sc.nextInt();

                    System.out.println("请输入姓名");
                    name = sc.nextLine();
                    temp = sc.next();
                    System.out.println("请输入成绩");
                    great = sc.nextInt();

                    link.addBy(name, number, great);
                    System.out.println("添加成功");
                    break;
                case "g":
                    System.out.println(link.getlength());
                    break;
                case "e":
                    state = false;
                    break;
                default:
                    System.out.println("无效操作");
                    break;
            }

        }
        System.out.println("程序退出成功");
    }
}

class Link {
    Node head;

    public int getlength() {
        Node temp = head;
        int size = 0;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                size++;
                temp = temp.next;
            }
        }
        return size;
    }

    public Link() {
        head = new Node();
    }

    public void add(String name, int number, int great) {// 增 增加链表元素
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = new Node(name, number, great);
                break;

            } else {
                temp = temp.next;
            }
        }

    }

    public void addBy(String name, int number, int great) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {

                break;
            } else if (temp.next.number > number) {// 用temp的后一个元素来比较如果大于number 就表示找到了
                // 位置找到
                break;
            } else if (temp.next.number == number) {
                flag = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        if (flag) {
            System.out.println("该序号已有");
        } else {
            Node newnode = new Node(name, number, great);
            newnode.next = temp.next;
            temp.next = newnode;

        }

    }

    public void show() {// 输出 遍历链表
        Node temp = head.next;
        if (head.next == null) {
            System.out.println("该链表为空 没有元素");
            return;
        }
        while (true) {
            if (temp == null) {
                break;
            } else {
                System.out.println(temp);
                temp = temp.next;
            }
        }

    }

    public void deleat(int n) {// 删 删除指定元素
        Node temp;
        temp = head;
        while (true) {
            if (n < 1) {
                System.out.println("删除有误 输入序号需要为大于0 的正整数");
                break;
            }

            if (temp.next.number == n) {
                temp.next = temp.next.next;
                System.out.println("删除成功");
                break;
            } else if (temp.next.next == null) {
                System.out.println("删除失败，未找到该元素");
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    public void check(int n) {
        if (n < 1) {
            System.out.println("查询输入有误，请输入大于0的整数");
            return;
        }
        Node temp;
        temp = head;
        while (true) {
            if (temp.number == n) {
                System.out.println(temp);
                break;
            } else if (temp.next == null) {
                System.out.println("未找到该序号的元素");
                break;
            } else {
                temp = temp.next;
            }
        }

    }

    public void change(int n, int number, String name, int great) {
        Node temp;
        temp = head.next;
        if (n < 1) {
            System.out.println("改动输入有误，请输入大于0的正整数");
            return;
        }
        while (true) {

            if (temp.number == n) {
                temp.number = number;
                temp.great = great;
                temp.name = name;
                break;

            } else if (temp.next == null) {
                System.out.println("未找到该序号的元素");
                break;
            } else {
                temp = temp.next;
            }
        }
    }

}

class Node {
    Node next = null;
    String name = null;
    int number = 0;
    int great = 0;

    public Node() {
    }

    public Node(String name, int number, int great) {
        this.great = great;
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "学号：" + this.number + "姓名：" + this.name + "成绩：" + this.great;

    }
}