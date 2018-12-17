package util;

import problems19.ListNode;

public class ListUtil {
    public String toString(ListNode head){

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        ListNode current = head;
        if(current!=null){
            sb.append(current.getVal());
            while(current != null){
                sb.append(","+current.getVal());
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static ListNode createList(int[] nums){
        ListNode head = null;
        if(nums.length > 0){
            head = new ListNode(nums[0]);
            ListNode current = head;
            for(int i=1;i<nums.length-1;i++){
                current.setNext(new ListNode(nums[i]));
                current = current.getNext();
            }
        }
        return head;
    }
}
