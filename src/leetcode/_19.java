package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Remove Nth Node From End of List Total Accepted: 64966 Total Submissions: 241501 My Submissions Question Solution
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
    //注意删除头结点的情况
public class _19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null)return null;
        if(head.next==null&&n==1)return null;
        ListNode pre=head;
        ListNode nxt=head;
       for(int i=0;i<n;i++){
           nxt=nxt.next;
       }
        if(nxt==null)return head.next;
        while(nxt.next!=null){
            nxt=nxt.next;
            pre=pre.next;
        }
            ListNode delNode = pre.next;
            pre.next = delNode.next;
        return head;
    }
}
