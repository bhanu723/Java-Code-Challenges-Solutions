package leetcode;

/*
 * @Author: BhanuSurendra Deepala
 */

public class RemoveDuplicatesSortedLinkedList {

	public static void main(String[] args) {

		
	}
	
	  public ListNode deleteDuplicates(ListNode head) {
	        ListNode tempHead = head; // Take temporary head reference
	        
	        while(tempHead!=null){ // traverse through end of linked list
	            
	            if(tempHead.next==null) // condition if there is only 1 element, break & return head
	                break;
	            
	            if(tempHead.val==tempHead.next.val){// as the list is sorted, check if neighbors are same, if yes then remove the link and connect to next node
	                tempHead.next=tempHead.next.next;
	            }
	            else
	                tempHead=tempHead.next; // else just goto next element and loop
	        }
	        
	        return head;// return head but not tempHead bcz you already traversed to end by tempHead
	        
	    }
	  
	  class ListNode{
		  int val;
		  ListNode next;
	  }

}
