/**
 * @Author:hll
 * @Created:2018/11/14
 **/
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newListNode = null;
        if(l1.val <= l2.val){
            newListNode = l1;
            l1 = l1.next;
        }else{
            newListNode = l2;
            l2 = l2.next;
        }
        ListNode nextNode = newListNode;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                nextNode.next = l1;
                l1 = l1.next;
            }else {
                nextNode.next = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            nextNode.next = l1;
        }else if(l2 != null){
            nextNode.next = l2;
        }
        return newListNode;
    }
}
