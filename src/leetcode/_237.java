package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/5.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class _237 {
    public void deleteNode(ListNode node){
        if(node==null)return;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

