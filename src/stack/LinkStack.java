package stack;

public class LinkStack implements StackIntf {
    StackNode top;


    /**
     * 链栈上实现初始化操作：
     */
    public LinkStack() {
        top = null;
    }

    /**
     * 链栈上实现进栈操作
     *
     * @param x
     */
    public void push(int x) {
        StackNode newNode = new StackNode();  //生成新结点
        newNode.data = x;
        newNode.next = top;     //链入新结点
        top = newNode;          //修改栈顶指针
    }


    /**
     * 链栈上实现出栈操作
     *
     * @return
     */
    public int pop() {
        //若栈不空，删去栈顶元素并返回元素值，否则返回空元素NULL
        StackNode p = null;
        int x;
        if (top == null)
            return -1;
        else {
            x = top.data;
            top = top.next;
            return x;       //返回原栈顶元素值
        }
    }

    @Override
    public int size() {
        StackNode p = top;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null ? true : false;
    }

    @Override
    public int top() {
        return top.data;
    }

    public void printStack() {
        StackNode p = top;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}
