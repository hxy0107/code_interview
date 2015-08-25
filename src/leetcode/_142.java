package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/24.
 */
/*
Linked List Cycle II Total Accepted: 51437 Total Submissions: 163628 My Submissions Question Solution
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?
 */
public class _142 {
    public ListNode detectCycle(ListNode head){
        ListNode p1=head;
        ListNode p2=head;
        while(p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2)break;
        }
        if(p2==null||p2.next==null)return null;
        p1=head;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
