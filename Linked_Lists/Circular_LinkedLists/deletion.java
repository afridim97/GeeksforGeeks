/*package whatever //do not write package name here */

import java.io.*;

class LinkedList{
    
    Node head;
    
    static class Node{
        
        int data;
        
        Node next;
        
        Node(int data){
            
            this.data=data;
            
            next=null;
        }
    }
static Node push(Node head_ref, int data)
    {
        // Create a new node and make head as next
        // of it.
        Node ptr1 = new Node(data);
        //ptr1.data = data;
        ptr1.next = head_ref;
 
        /* If linked list is not null then set the 
    next of last node */
        if (head_ref != null) {
            // Find the node before head and update
            // next of it.
            Node temp = head_ref;
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        }
        else
            ptr1.next = ptr1; /*For the first node */
 
        head_ref = ptr1;
        return head_ref;
    }
 
    /* Function to print nodes in a given 
circular linked list */
    static void printList(Node head)
    {
        Node temp = head;
        if (head != null) {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }
 
        System.out.printf("\n");
    }
 
    static Node deleteNode(Node head,int item){
        
        if(head==null)
            return null;
            
        Node temp=head,prev=null;
        
        while(temp.data!=item){
            
            prev=temp;
            
            temp=temp.next;
            
            if(temp.next==head){
                
                System.out.print("couldnt find it");
                break;
            }
            
        }
        
        if(temp==head && temp.next==head){
            
            head=null;
            return head;
            
        }
        
        if(temp==head){
            
         prev=head;
            
            while(prev.next!=head){
                
                prev=prev.next;
            }
            
            temp=head.next;
            head=temp;
            prev.next=temp;
            
        }
        
        else{
            
            prev.next=temp.next;
            
        }
        
        return head;
    }
	public static void main (String[] args) {
	    
	    Node head = null;
 
        /* Created linked list will be 2.5.7.8.10 */
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);
 
        System.out.printf("List Before Deletion: ");
        printList(head);
 
        head = deleteNode(head, 7);
 
        System.out.printf("List After Deletion: ");
        printList(head);
		System.out.println("GfG!");
	}
}
