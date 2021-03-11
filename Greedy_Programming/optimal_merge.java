/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    int optim(int[] arr,int n){
        
        Queue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
            q.push(arr[i]);
            
            
            int count=0;
            
        while(q.size()>1){
            
            int temp=q.pop()+q.pop(); //cost of merging 2 files of q.pop() elements
            
            count+=temp; //adding cost
            
            q.push(temp); //pushing cost of merging rest of files with merged file
            
            
        }
        
        return count;
        
    }
    
	public static void main (String[] args) {
	    
	       int size = 6; 
  
        // 6 files with their sizes 
        int files[] = new int[] { 2, 3, 4, 5, 6, 7 }; 
		System.out.println("GfG!");
	}
}
