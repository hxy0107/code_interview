package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/24.
 */
/*
Remove Duplicates from Sorted List II Total Accepted: 49357 Total Submissions: 197291 My Submissions Question Solution
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class _82 {
    public ListNode deleteDuplicates(ListNode head){
        if(head==null)return null;
        if(head.next!=null&&head.val==head.next.val){
            while(head.next!=null&&head.val==head.next.val){
                head=head.next;
            }
            return deleteDuplicates(head.next);
        }else {
            head.next=deleteDuplicates(head.next);
        }
        return head;
    }
}
