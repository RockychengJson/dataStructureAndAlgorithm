package stack;

public class TestLinkStack {
    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();
        for (int i = 0; i < 10; i++) {
            linkStack.push(i);
        }
        System.out.println("栈的深度为：" + linkStack.size());
        System.out.println("栈顶元素出栈");
        System.out.println("栈顶元素为：" + linkStack.pop());
        System.out.println();
        System.out.println("弹出并打印所有元素");
        linkStack.printStack();
    }
}
