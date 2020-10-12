package stack;

public class StackApplication {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(100));
    }

    /**
     * 利用栈实现10机制转2进制
     *
     * @param number
     * @return
     */
    public static String decimalToBinary(int number) {
        SeqStack seqStack = new SeqStack();
        int result = number;
        int reminder = 0;
        while (result != 0) {
            reminder = result % 2;
            result = result / 2;
            seqStack.push(reminder);
        }

        int temp;
        StringBuilder binaryResult = new StringBuilder();
        while ((temp = seqStack.pop()) != -1) {
            binaryResult.append(temp);
        }
        return binaryResult.toString();
    }
}
