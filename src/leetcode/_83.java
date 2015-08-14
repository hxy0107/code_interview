package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Remove Duplicates from Sorted List Total Accepted: 68666 Total Submissions: 199552 My Submissions Question Solution
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class _83 {
    //对于非sorted list
    public static ListNode deleteDuplicates(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode p=head;
        ListNode fackHead=new ListNode(0);
        ListNode fp=fackHead;
        List<Integer> list=new ArrayList<Integer>();
        ListNode chg;
        while(p!=null){
            int tmp=p.val;
            if(!list.contains(tmp)){
                list.add(tmp);
                fp.next=new ListNode(tmp);
                fp=fp.next;
                p=p.next;
            }else{
                chg=p.next;
                p.next=null;
                p=chg;
            }
        }
        return fackHead.next;
    }
    //单指针
    public static ListNode deleteDumplicates1(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode p=head;
        while(p!=null&&p.next!=null){
            if(p.val==p.next.val){
                p.next=p.next.next;
            }else {
                p=p.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        ListNode t1=new ListNode(1);
        ListNode t2=new ListNode(1);
        t1.next=t2;
        deleteDuplicates(t1);
    }
}
