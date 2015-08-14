package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Merge Two Sorted Lists Total Accepted: 70379 Total Submissions: 216268 My Submissions Question Solution
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class _21 {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode p1=l1;
        ListNode q2=l2;
        ListNode fakeHead=new ListNode(0);
        ListNode p=fakeHead;
        while(p1!=null&&q2!=null)
        {
            if(p1.val<=q2.val){
                p.next=p1;
                p1=p1.next;
            }else{
                p.next=q2;
                q2=q2.next;
            }
            p=p.next;
        }
        if(p1!=null)
            p.next=p1;
        if(q2!=null)
            p.next=q2;
        return fakeHead.next;
    }
}
