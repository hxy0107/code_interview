package cc150.linked_lists;

import sun.awt.image.ImageWatched;

/**
 * Created by xianyu.hxy on 2015/8/16.
 */
/*
2 5 Given a circular linked list, implement an algorithm which returns node at the beginning of the loop
DEFINITION
Circular linked list: A (corrupt) linked list in which a node¡¯s next pointer points to an
earlier node, so as to make a loop in the linked list
EXAMPLE
Input: A -> B -> C -> D -> E -> C [the same C as earlier]
Output: C
 */
public class _2_5 {
    LinkedListNode FindBeginning(LinkedListNode head){
        LinkedListNode n1=head;
        LinkedListNode n2=head;
        while (n2.next!=null){
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2)break;
        }
        if(n2.next==null){
            return null;
        }
        n1=head;
        while (n1!=n2){
            n1=n1.next;
            n2=n2.next;
        }
        return n2;
    }
}
