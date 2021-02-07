/*package whatever //do not write package name here */

import java.io.*;

class StackAsLinkedList {
    
    StackNode head;
    
    static class StackNode{
    
        int data;
        
        StackNode next;
        
        StackNode(int data){
            
            this.data=data;
            
            this.next=null;
        }
        
    }
    
    void push(int data){
        
        if(head==null){
            head=new StackNode(data);
            return;
    }
    
        StackNode new_node=new StackNode(data);
        
        new_node.next=head;
        
        head=new_node;
        
    }
    
    int pop(){
        
        StackNode temp=head;
        
        int pop=temp.data;
        
        
        head=temp.next;
        
        temp=null;
        
        return pop;
    }
    
    int peek(){
        
        if(head==null)
            return 0;
            
        return head.data;
    }
    
	public static void main (String[] args) {
	    
	    StackAsLinkedList sll = new StackAsLinkedList();
 
        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());
		System.out.println("GfG!");
	}
}
