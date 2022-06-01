package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */

	// @Author: BhanuSurendra Deepala
	public boolean isPalindrome(ListNode head) {

		Stack<ListNode> st = new Stack<ListNode>(); // Create a stack of ListNodes
		ListNode temp = head;

		while (temp != null) {
			st.push(temp); // push references of each node to stack, so while poping we get last item for
							// comparision
			temp = temp.next;
		}

		while (head != null) {
			if (st.pop().val != head.val) // simplay compare stack first value(which is last of linked list with
											// original linked list values)
				return false;

			head = head.next;

		}
		return true;

	}
	
	 public class ListNode { 
		 int val; 
		 ListNode next; 
		 ListNode() {} 
	 }

}
