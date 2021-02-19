/*package whatever //do not write package name here */

import java.io.*;

class CircularQueue {
    
    
    int front,rear,size,maxsize;
    
    int[] queue;
    
    CircularQueue(int maxsize){
        
        this.maxsize=maxsize;
        
        this.size=0;
        
        this.front=this.rear=-1;
        
        this.queue=new int[maxsize];
        
    }
    
    void enQueue(int data){
        
        if(front==-1&&rear==-1){
            
            front=rear=0;
            
            queue[rear++]=data;
            
            return;
            
        }
        
        if(rear==maxsize){
            
            rear=(rear+1)%maxsize;
            
            queue[rear++]=data;
            
            return;
        }
        
        if((rear+1)%maxsize==front){
            
            System.out.println("full!");
            
            return;
        }
        
        else{
            
            queue[rear++]=data;
            
            return;
        }
        
        
    }
    
    int deQueue(){
        
        if(front==-1&&rear==-1){
            
            System.out.println("empty");
            
            return -1;
        }
        
        
        else{
            
            //System.out.println(queue[front]);
            
            front=(front+1)%maxsize;
            
           // return queue[front];
        }
        
        return queue[front];
        
    }
        
        public void displayQueue() 
{ 
      
    // Condition for empty queue. 
    if(front == -1) 
    { 
        System.out.print("Queue is Empty"); 
        return; 
    } 
  
    // If rear has not crossed the max size 
    // or queue rear is still greater then 
    // front. 
    System.out.print("Elements in the " + 
                     "circular queue are: "); 
  
    if(rear >= front) 
    { 
      
        // Loop to print elements from 
        // front to rear. 
        for(int i = front; i <= rear; i++) 
        { 
            System.out.print(queue[i]); 
            System.out.print(" "); 
        } 
        System.out.println(); 
    } 
  
    // If rear crossed the max index and 
    // indexing has started in loop 
    else
    { 
          
        // Loop for printing elements from 
        // front to max size or last index 
        for(int i = front; i < size; i++) 
        { 
            System.out.print(queue[i]); 
            System.out.print(" "); 
        } 
  
        // Loop for printing elements from 
        // 0th index till rear position 
        for(int i = 0; i <= rear; i++) 
        { 
            System.out.print(queue[i]); 
            System.out.print(" "); 
        } 
        System.out.println(); 
    } 
        
        
    }
    
	public static void main (String[] args) {
	    
	    
    // Initialising new object of 
    // CircularQueue class. 
    CircularQueue q = new CircularQueue(5); 
      
    q.enQueue(14); 
    q.enQueue(22); 
    q.enQueue(13); 
    q.enQueue(-6); 
      
    q.displayQueue(); 
  
    int x = q.deQueue(); 
  
    // Checking for empty queue. 
    if(x != -1) 
    { 
        System.out.print("Deleted value = "); 
        System.out.println(x); 
    } 
  
    x = q.deQueue(); 
  
    // Checking for empty queue. 
    if(x != -1) 
    { 
        System.out.print("Deleted value = "); 
        System.out.println(x); 
    } 
  
    q.displayQueue(); 
      
    q.enQueue(9); 
    q.enQueue(20); 
    q.enQueue(5); 
      
    q.displayQueue(); 
      
    q.enQueue(20); 
}
		//System.out.println("GfG!");
	
}
