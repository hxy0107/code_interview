package cc150.linked_lists;

/**
 * Created by xianyu.hxy on 2015/8/16.
 */
/*
2 3 Implement an algorithm to delete a node in the middle of a single linked list, given
only access to that node
EXAMPLE
Input: the node ¡®c¡¯ from the linked list a->b->c->d->e
Result: nothing is returned, but the new linked list looks like a->b->d->e
 */
public class _2_3 {
public static boolean deleteNode(LinkedListNode n){
    if(n==null||n.next==null){
        return false;
    }
    LinkedListNode next=n.next;
    n.data=next.data;
    n.next=next.next;
    return true;
}
}
