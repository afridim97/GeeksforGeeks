/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int findmax(int[] arr,int n,int k){
        
        int start=0;
        
        int zerocount=0,maxonescount=0;
        
        for(int end=0;end<n;end++){
            
            if(arr[end]==0){
                
                zerocount++;
                
            }
            
            while(zerocount>k){
                
                start++;
                
                if(arr[start]==0){
                    
                    zerocount--;
                }
                
            }
            
            
            
            maxonescount=Math.max(maxonescount,end-start+1);
            
        }
        
        
        return maxonescount;
        
    }
    
	public static void main (String[] args) {
	    
	    int k = 3;  
      
    // Array initialization  
    int arr[] = { 0, 0, 1, 1, 0, 0, 0, 0 };  
  
    // Size of array  
    int n = arr.length;  
    int ans = findmax(arr, n, k);  
      
    System.out.println(ans);
	    
		System.out.println("GfG!");
	}
}
