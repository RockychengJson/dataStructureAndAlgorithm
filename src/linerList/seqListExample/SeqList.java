package linerList.seqListExample;

import linerList.LinearList;

import java.util.Arrays;

/**
 * 顺序表实现
 *
 * @param <T>
 */
public class SeqList<T> implements LinearList<T> {
    private final static int DEFAULT_SIZE = 8; //顺序表默认长度

    private int capacity; //顺序表容量，长度

    private Object[] elements; //定义一个数组用于保存线性表

    private int n; //当前顺序表中元素个数

    /**
     * 以默认长度初始化顺序表
     */
    public SeqList() {
        capacity = DEFAULT_SIZE;
        elements = new Object[capacity];
        n = 0;
    }

    /**
     * 给定长度，初始化顺序表
     */
    public SeqList(int initialCapacity) {
        if (initialCapacity >= 0) {
            capacity = initialCapacity;
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("顺序表长度非法: " +
                    initialCapacity);
        }
    }


    /**
     * 清空顺序表
     */
    @Override
    public void clear() {
        Arrays.fill(elements, null);
        n = 0;
    }

    /**
     * 顺序表判空
     *
     * @return 顺序表是否为空
     */
    @Override
    public boolean isEmpty() {

        return n == 0;
    }

    /**
     * 求顺序表的长度
     *
     * @return 顺序表包含元素个数
     */
    @Override
    public int length() {
        return n;
    }

    /**
     * @param index
     * @return 顺序表index位置上的元素
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > n - 1) {
            throw new IndexOutOfBoundsException("数组越界异常:" + index);
        }
        return (T) elements[index];
    }

    /**
     * 往顺序表第index位置插入元素x
     *
     * @param index
     * @param x
     */
    @Override
    public void insert(int index, T x) {
        //ensureCapacity(size + 1);
        if (n == capacity) {
            System.out.println("数组已满，无法插入");
            return;
        }

        if (index < 0 || index > n) {
            System.out.println("插入位置不合法:" + index);
            return;
        }

        //把index以后的元素都后移一位
        //System.arraycopy(elements, index, elements, index + 1, size - index);
        for (int i = n - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = x;
        n++;
    }

    /**
     * 删除顺序表index位置的元素
     *
     * @param index
     */
    @Override
    public T delete(int index) {
        if (index < 0 || index > n - 1) {
            System.out.println("删除位置非法:" + index);
            return null;
            //throw new IndexOutOfBoundsException("数组越界异常:" + index);
        }
        //System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        Object deletedElement = elements[index];
        for (int i = index + 1; i <= n - 1; i++) {
            elements[i - 1] = elements[i];
        }
        elements[n - 1] = null; //也可以不要
        n--;
        return (T) deletedElement;
    }

    /**
     * 删除顺序表中值为value的元素
     *
     * @param value
     */
    @Override
    public void remove(T value) {
        int index = indexOf(value);
        delete(index);
    }


    /**
     * 返回元素X在顺序表中的位置
     *
     * @param x
     * @return
     */
    @Override
    public int indexOf(T x) {
        for (int i = 0; i < n - 1; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 输出顺序表元素
     */
    @Override
    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    /**
     * 顺序表动态扩容
     * 扩容策略，长度翻倍
     *
     * @param minCapacity 顺序表最小所需长度
     */
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            capacity *= 2;
            elements = Arrays.copyOf(elements, capacity);
        }
    }

    /**
     * 查找顺序表中值为value的前一个元素的值
     *
     * @param value
     * @return
     */
    @Override
    public T getPre(T value) {
        int index = indexOf(value);
        if (index != -1 && index != 0) {
            return (T) elements[index - 1];
        }
        return null;
    }

    /**
     * 查找顺序表中值为value的后一个元素的值
     *
     * @param value
     * @return
     */
    @Override
    public T getNext(T value) {
        int index = indexOf(value);
        if (index != -1 && index != n - 1) {
            return (T) elements[index + 1];
        }
        return null;
    }

    /**
     * 将顺序表反向
     */
    public void reverse() {
        Object temp;
        for (int i = 0; i <= n / 2; i++) {
            temp = elements[i];
            elements[i] = elements[n - 1 - i];
            elements[n - 1 - i] = temp;
        }
    }
}
