/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;

class GFG {
    
    static Stack<Integer> s=new Stack<>();
    
    static void reverse(){
        
        if(!s.isEmpty()){
            int elem=s.peek();
            s.pop();   
        

        reverse();
        
        insertbottom(elem);
        
        }
        
    }
    
    static void insertbottom(int elem){
        
        if(s.isEmpty()){
            
            s.push(elem);
            
            return;
            
        }
        
        else{
            
            int top=s.pop();
            
            insertbottom(elem);
            
            s.push(top);
            
            return;
            
        }
        
        
    }
	public static void main (String[] args) {
	    
	     
        // push elements into 
        // the stack 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(s); 
          
        // function to reverse  
        // the stack 
        reverse(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(s); 
	    
	    
		System.out.println("GfG!");
	}
}
