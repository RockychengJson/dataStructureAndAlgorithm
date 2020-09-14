package linerList;

public interface LinearList<T> {

    void clear(); //清空线性表

    boolean isEmpty(); //判空

    int length(); //线性表长度

    T get(int pos); //查询线性表位置pos的值

    void insert(int i, T x);// 在线性表的第i个数据元素之前插入一个值为x的数据元素。其中i取值范围为：0≤i≤length()。如果i值不在此范围则抛出异常,当i=0时表示在表头插入一个数据元素x,当i=length()时表示在表尾插入一个数据元素x

    T delete(int i);// 将线性表中第i个数据元素删除。其中i取值范围为：0≤i≤length()- 1,如果i值不在此范围则抛出异常

    void remove(T value);//删除值为value的元素

    T getPre(T value);

    T getNext(T value);

    int indexOf(T x);// 返回线性表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1

    void display();// 输出线性表中的数据元素
}
