package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Intersection of Two Linked Lists Total Accepted: 38632 Total Submissions: 134115 My Submissions Question Solution
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 ¡ú a2
                   ¨K
                     c1 ¡ú c2 ¡ú c3
                   ¨J
B:     b1 ¡ú b2 ¡ú b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
Credits:
Special thanks to @stellari for adding this problem and creating all test cases.
 */
public class _160 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null)return null;
        int num1=0,num2=0,dif=0;
        ListNode p=headA;
        ListNode q=headB;
        while(p!=null){
            num1++;
            p=p.next;
        }
        while(q!=null){
            num2++;
            q=q.next;
        }
        if(num1>=num2){
            dif=num1-num2;
            p=headA;
            q=headB;
            for(int i=0;i<dif;i++){
                p=p.next;
            }
        }else {
            dif=num2-num1;
            p=headA;
            q=headB;
            for(int j=0;j<dif;j++){
                q=q.next;
            }
        }
        while(p!=null&&q!=null){
            if(p.val==q.val)
                return p;
            p=p.next;
            q=q.next;
        }
        return null;
    }
}


















