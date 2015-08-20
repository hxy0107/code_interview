package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/20.
 */
public class _141 {
    public boolean hasCycle(ListNode head){

        ListNode slow=head;
        ListNode quick=head;
        while (quick!=null&&quick.next!=null){
            slow=slow.next;
            quick=quick.next.next;
            if(slow==quick)return true;
        }
        return false;
    }
}
