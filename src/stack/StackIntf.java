package stack;

public interface StackIntf {
    public void push(int x);//数据入栈操作

    public int pop();  //数据出栈操作

    public int size(); //返回当前栈中元素个数

    public void clear();  //清空栈

    public boolean isEmpty();  //判断栈是否为空

    public int top(); //读取栈首元素

}
