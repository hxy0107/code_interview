package cc150.linked_lists;

/**
 * Created by xianyu.hxy on 2015/8/16.
 */
/*
2 4 You have two numbers represented by a linked list, where each node contains a single digit  The digits are stored in reverse order, such that the 1¡¯s digit is at the head of
the list  Write a function that adds the two numbers and returns the sum as a linked
list
EXAMPLE
Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
Output: 8 -> 0 -> 8
pg 5
 */

public class _2_4 {
    /*
    LinkedListNode addList(LinkedListNode l1,LinkedListNode l2,int carry){
        if(l1==null&&l2==null){
            return null;
        }
        LinkedListNode result=new LinkedListNode(carry,null,null);
        int value=carry;
        if(l1!=null){
            value+=l1.data;
        }
        if(l2!=null){
            value+=l2.data;
        }
        result.data=value%10;
        LinkedListNode more=addList(l1==null?null:l1.next,l2==null?null:l2.next,value>10?1:1);
        result.setNext(more);
        return result;
    }
    */
}
