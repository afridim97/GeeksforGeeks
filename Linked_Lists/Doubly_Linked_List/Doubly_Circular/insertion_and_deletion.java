/*package whatever //do not write package name here */

import java.io.*;

class LinkedList {
    
    static Node head;
    
    class Node{
        
        int data;
        
        Node next,prev;
        
        Node(int data){
            
            this.data=data;
            
            this.next=null;
            
            this.prev=null;
        }
    }
    
    void insertatend(int data){
        
        if(start==null){
            Node new_node=new Node(data);
            start=new_node;
            start.next=start.prev=new_node;
            return;
        }
            
        Node last=(start).prev;
        
        Node new_node=new Node(data);
        
        last.next=new_node;
        
        new_node.prev=last;
        
        new_node.next=start;
        
        start.prev=new_node;
        
        //start=new_node;
        //plus that for insertatbeg
        
    }
    
    void insertafter(int value1,int value2){
        
        if(start==null)
            return;
            
        Node curr=start,prev=null;
        
        while(curr.data!=value2)
            curr=curr.next;
            
        Node new_node=new Node(value1);
        
        curr.next=new_node;
        
        new_node.prev=curr;
        
        if(new_node.next!=null)
            new_node.next.prev=new_node;
        
        
    }
    
    static Node delete(int key){
        
        if(start==null)
            return;
            
        Node curr=start;
        
        while(curr.data!=key)
            curr=curr.next;
            
        if(curr==start && curr.next==start){
            curr=null;
            return start;
        }
        
        if(curr==start){
            
            Node prev=start.prev;
            
            start=start.next;
            
            prev.next=start;
            
            start.prev=prev;
            
            return start;
            
        }
        
        if(curr.next==start){
            
            Node prev=start.prev;
            
            prev.next=start.next;
            
        }
        
        else{
            
            prev.next=curr.next;
            
            curr.next.prev=prev;
        }
        return start;
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
