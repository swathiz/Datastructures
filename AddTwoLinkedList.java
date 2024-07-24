package prac;

import java.util.Arrays;
import java.util.LinkedList;

class ListNode{
	int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	     

public ListNode head = null;
public ListNode tail = null;

public void addNode(int data) {
	ListNode newNode = new ListNode(data);
	
	if(head == null) {
		head = newNode;
		tail = newNode;
	}else {
		tail = newNode;
		tail.next = newNode;
	}
}

public void display() {
	ListNode current = head;
	
	if(head == null) {
		return;
	}
	
	while(current != null) {
		System.out.print(current.val+" ");
		current = current.next;
	}
	System.out.println();
}


}




public class AddTwoLinkedList {
	public static void main(String[] args) {
//		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2,4,3));
//		LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(7,0,8));
	    ListNode l1 = new ListNode();
	    l1.addNode(2);
	    l1.addNode(4);
	    l1.addNode(3);
	    
	    ListNode l2 = new ListNode();
	    l2.addNode(7);
	    l2.addNode(0);
	    l2.addNode(8);
	    addTwoNumbers(l1, l2).display();
	
		System.out.println();
		
	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	      
		 ListNode dummy = new ListNode(0); // creating a dummy linked list
		 ListNode curr = dummy; // Intilizing a pointer
		 
		 int carry = 0; 
		 
		 // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it. 
		 // We will add that as well into our list
		 while(l1 != null || l2 != null || carry == 1) {
			 int sum = 0;
			 
			 if(l1 != null) {
				 sum = sum + l1.val;
				 l1 = l1.next;
			 }
			 
			 if(l2 != null) {
				 sum = sum + l2.val; // adding the current node value to the sum
				 l2 = l2.next; // pointing to next value in the ll
			 }
			 
			 sum = sum + carry; // if carry exists add it to sum
			
			 carry = sum/10; // if carry, then divide it by carry
			 ListNode node = new ListNode(sum%10); // the value we get by sum mode 10 will become new node, add that to List
			 curr.next = node; // pointing the curr to new node
			 curr = curr.next; // moving to the curr nextnode
			 
		 }
		
		 return dummy.next; //  return dummy.next bcz, we don't want the value we have consider in it intially
		 
		 
	 }
	
	
}
