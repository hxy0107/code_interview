package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/24.
 */
/*
Insertion Sort List Total Accepted: 50338 Total Submissions: 187989 My Submissions Question Solution
Sort a linked list using insertion sort.
 */
public class _147 {
    public ListNode insertionSortList(ListNode head){
        if(head==null)return head;
        ListNode helper=new ListNode(0);
        ListNode cur=head;
        ListNode pre=helper;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            while(pre.next!=null&&pre.next.val<cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            pre=helper;
             cur=next;
        }
        return helper.next;
    }
}
