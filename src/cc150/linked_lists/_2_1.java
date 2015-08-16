package cc150.linked_lists;

import java.util.Hashtable;

/**
 * Created by xianyu.hxy on 2015/8/16.
 */
/*
2 1 Write code to remove duplicates from an unsorted linked list
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 */
public class _2_1 {
    public static void deleteDups(LinkedListNode n){
        Hashtable table=new Hashtable();
        LinkedListNode previous=null;
        while(n!=null){
            if(table.containsKey(n.data))previous.next=n.next;
            else {
                table.put(n.data,true);
                previous=n;
            }
            n=n.next;
        }
    }
    public static void deleteDups2(LinkedListNode head){
        if(head==null)return;
        LinkedListNode previous=head;
        LinkedListNode current=previous.next;
        while (current!=null){
            LinkedListNode runner=head;
            while(runner!=current){
                if(runner.data==current.data){
                    LinkedListNode tmp=current.next;
                    previous.next=tmp;
                    current=tmp;
                    break;
                }
                runner=runner.next;
            }
            if(runner==current){
                previous=current;
                current=current.next;
            }
        }
    }
}
