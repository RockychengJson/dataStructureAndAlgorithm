package stack;

public class SeqStack implements StackIntf {
    final int maxSize = 100;
    int[] element = new int[maxSize];
    int top; //指明栈顶

    public SeqStack() {
    }

    /**
     * 顺序栈上实现进栈操作
     *
     * @param x
     */
    public void push(int x) {
        // 若栈s未满，将元素x压入栈中；否则，栈的状态不变并给出出错信息
        if (top == maxSize)
            System.out.println("Overflow");
        else
            element[top++] = x;     //x进栈
    }


    /**
     * 顺序栈上实现出栈操作
     *
     * @return
     */
    public int pop() {
        // 若栈不空，则删去栈顶元素并返回元素值，否则返回空元素NULL
        if (top == 0)
            return 0;
        else {
            top--;           //栈顶指针减1
            return element[top];   //返回原栈顶元素值
        }
    }

    /**
     * 顺序栈上实现求栈深操作
     *
     * @return
     */
    public int size() {
        return top;
    }


    /**
     * 顺序栈上实现读取栈顶元素操作
     *
     * @return
     */
    public int top() {
        if (top == 0)
            return 0;
        else
            return element[top - 1];
    }

    /**
     * 顺序栈上实现栈置空操作
     */
    public void clear() {
        top = 0;
    }

    /**
     * 顺序栈上实现判栈空操作
     *
     * @return
     */
    public boolean isEmpty() {
        if (top > 0)
            return false;
        else
            return true;
    }
}
