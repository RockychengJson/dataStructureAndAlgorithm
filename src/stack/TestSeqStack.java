package stack;

public class TestSeqStack {
    public static void main(String[] args) {
        SeqStack seqStack = new SeqStack();
        for (int i = 0; i < 10; i++) {
            seqStack.push(i);
        }
        System.out.println("栈顶元素出栈");
        System.out.println("栈顶元素为：" + seqStack.pop());
        System.out.println();
        System.out.println("弹出并打印所有元素");
        seqStack.printStack();
    }
}
