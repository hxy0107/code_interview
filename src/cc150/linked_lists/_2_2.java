package cc150.linked_lists;

/**
 * Created by xianyu.hxy on 2015/8/16.
 */
/*
2 2 Implement an algorithm to find the nth to last element of a singly linked list
 */
public class _2_2 {
    LinkedListNode nthtoLast(LinkedListNode head,int n){
        if(head==null||n<1){
            return null;
        }
        LinkedListNode p1=head;
        LinkedListNode p2=head;
        for(int j=0;j<n-1;++j){
            if(p2==null){
                return null;
            }
            p2=p2.next;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
