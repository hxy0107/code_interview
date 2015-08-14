package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Remove Linked List Elements Total Accepted: 24632 Total Submissions: 95827 My Submissions Question Solution
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
 */
public class _203 {
    public static ListNode removeElements(ListNode head,int val){
        if(head==null)return null;
        while(head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null)return null;
        if(head.next==null)return head;

        ListNode p=head;
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }else {
                p = p.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        ListNode testNode=new ListNode(1);
        removeElements(testNode,1);
    }
}
