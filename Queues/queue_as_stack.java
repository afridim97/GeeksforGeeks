/*package whatever //do not write package name here */

import java.io.*;

class Q {
    
    class Queue{
        
        Stack<Integer> stack1;
        
        Stack<Integer> stack2;
        
    }
    
    void push(Stack<Integer> s1,int data){
        
        s1.push(data);
        
    }
    
    int pop(Stack<Integer> s1){
        
        return s1.pop();
        
    }
    
    void Enqueue(Queue q,int data){
        
        //int x=q.stack1.pop();
        
        q.stack2.push(x);
        
    }
    
    void dequeue(Queue q){
        
        if(q.stack2.isEmpty()){
            
            System.out.print("underflow");
            return;
        }
        
        while(!q.stack1.isEmpty()){
            
            int x=q.stack1.pop();
            
            enqueue(q,x);
            
            while(!q.stack2.isEmpty()){
            q.stack2.pop();
            
        }
        
        }
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
