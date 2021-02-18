/*package whatever //do not write package name here */

import java.io.*;

class ClosestPair {
    
    void printClosest(int[] arr1,int[] arr2,int m,int n,int x){
        
        int i=0,j=arr2.length-1,sum=0,closest=Integer.MAX_VALUE,res_l=0,res_r=0;
        
        while(i<arr1.length&&j>=0){
            
            sum=arr1[i]+arr2[j];
            
            if(sum<closest){
                
                closest=sum;
                
                res_l=i;
                
                res_r=j;
            }
            
            if(sum>x){
                
                j--;
            }
            
            else{
                
                i++;
            }
            
        }
        
        System.out.print(arr1[res_l]+" "+arr2[res_r]);
        
        
    }
	public static void main (String[] args) {
	    
	    ClosestPair ob = new ClosestPair(); 
        int ar1[] = {1, 4, 5, 7}; 
        int ar2[] = {10, 20, 30, 40}; 
        int m = ar1.length; 
        int n = ar2.length; 
        int x = 38; 
        ob.printClosest(ar1, ar2, m, n, x);
		System.out.println("GfG!");
	}
}
