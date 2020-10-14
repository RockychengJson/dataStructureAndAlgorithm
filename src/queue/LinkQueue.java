package queue;

public class LinkQueue implements QueueInter {
    QueueNode front, rear;

    /**
     * 算法3.18 在链队列上实现初始化操作:
     */
    public LinkQueue() {
        //设置一个空的链队列
        front = new QueueNode();
        front.next = null;
        rear = front;
    }

    /**
     * 在链队列上实现判队空操作：
     *
     * @return
     */
    public boolean isEmpty() {
        return front == rear ? true : false;
    }

    /**
     * 在链队列上实现求队长度操作：
     *
     * @return
     */
    public int size() {
        //返回队列中元素个数
        int i = 0;
        QueueNode p = front.next;
        while (p != null) {
            i++;
            p = p.next;
        }
        return i;
    }


    /**
     * 在链队列上实现读队头元素操作：
     *
     * @return
     */
    public int head() {
        //若链队列不空，则返回队头元素值；否则返回空元素NULL
        return front == rear ? 0 : front.next.data;
    }

    /**
     * 在链队列上实现入队操作：
     *
     * @param x
     */
    public void enQueue(int x) {
        //在链队列中，插入x为新的队尾元素
        QueueNode s = new QueueNode();
        s.data = x;
        s.next = null;
        rear.next = s;
        rear = s;
    }

    /**
     * 在链队列上实现出队操作：
     *
     * @return
     */
    public int deQueue() {
        //若链队列不空，则删去队头元素并返回元素值；否则返回空元素NULL
        int x;
        QueueNode p;
        if (front == rear)
            return 0;
        else {
            p = front.next;
            front.next = p.next;
            if (p.next == null)
                rear = front; //当链队列中仅有一个结点时，出队时还需修改尾指针
            x = p.data;
            p = null;
            return x;
        }
    }

    @Override
    public void clear() {

    }


}
