package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
public class _206 {
    /*³¬ÄÚ´æÁË
    public ListNode reverseList(ListNode head){
        if(head==null)return null;
        if(head.next==null)return head;
        if(head.next.next==null){
            ListNode temp=head.next;
            head.next.next=head;
            head.next=null;
            return temp;
        }
        ListNode e=head;
        ListNode p=head.next;
        ListNode q=head.next.next;
        while(q.next!=null){
            e.next=null;
            p.next=e;
            e=p;
            p=q;
            q=q.next;
        }
        q.next=p;
        return q;
    }
    */
    //µÝ¹é
    public ListNode reverseList(ListNode head){
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode p=head.next;
        ListNode q=reverseList(p);

        head.next=null;
        p.next=head;
        return q;
    }
    // µü´ú
    public ListNode reverseList1(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode pre=head;
        ListNode p=head.next;
        pre.next=null;
        ListNode nxt;

        while(p!=null){
            nxt=p.next;
            pre.next=null;
            p.next=pre;
            pre=p;
            p=nxt;
        }
        return pre;

    }
}
