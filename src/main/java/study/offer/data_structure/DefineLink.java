package study.offer.data_structure;

/**
 * @program: java study
 * @description: 链表
 * @author: Kelly.Xing
 * @create: 2019-09-25 13:32
 **/
public class DefineLink {
    public Entry head;

    public DefineLink() {
        this.head = new Entry();
    }

    public class Entry {
        public int data;
        public Entry next;

        public Entry() {//将头结点初始化为  data=-1   next=null
            data = -1;
            next = null;
        }

        public Entry(int val) {//其他结点所需的构造函数
            data = val;
            next = null;

        }
    }

    public void insertTail(int val) {
        Entry tmp;
        Entry cur = new Entry(val);
        tmp = head;
        /*
         * 遍历链表到最后一个结点
         */
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = cur;
        cur.next = null;
    }
}
