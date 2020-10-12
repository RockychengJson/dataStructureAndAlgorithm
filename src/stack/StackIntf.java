package stack;

interface StackIntf {
    void push(int x);//数据入栈操作

    int pop();  //数据出栈操作

    int size(); //返回当前栈中元素个数

    void clear();  //清空栈

    boolean isEmpty();  //判断栈是否为空

    int top(); //读取栈首元素

    void printStack(); //打印栈元素

}
