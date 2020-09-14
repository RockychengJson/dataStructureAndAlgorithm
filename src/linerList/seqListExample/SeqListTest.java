package linerList.seqListExample;

public class SeqListTest {
    public static void main(String[] args) throws Exception {
        SeqList<Integer> seqList = new SeqList<>();
        System.out.println("顺序表元素数量：" + seqList.length());
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("插入元素");
        for (int i = 0; i < array.length; i++) {
            seqList.insert(i, array[i]);
        }
        System.out.println("顺序表元素数量：" + seqList.length());
        System.out.println("插入后顺序表元素如下：");
        seqList.display();
        System.out.println("在位置3上插入元素100：");
        seqList.insert(3, 100);
        System.out.println("顺序表位置3上的元素为：" + seqList.get(3));
        System.out.println("顺序表元素如下：");
        seqList.display();
        System.out.println("删除位置为4上的元素：");
        seqList.delete(4);
        System.out.println("删除后：");
        seqList.display();
        System.out.println("顺序表中元素100的位置为：" + seqList.indexOf(100));
        System.out.println("删除顺序表中值为100的元素");
        seqList.remove(100);
        seqList.display();
    }
}
