/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class G {
    
    //common elements in three sorted arrays
    
    static void findCommon(int[] arr1,int[] arr2,int[] arr3,int m,int n,int o){
        
        int i=0,j=0,k=0;
        
        int prev1=Integer.MIN_VALUE,prev2=Integer.MIN_VALUE,prev3=Integer.MIN_VALUE;
        
        while(i<arr1.length&&j<arr2.length&&k<arr3.length){
            
            while(arr1[i]==prev1 && i+1<arr1.length){
                
                i++;
            }
            
            while(arr2[j]==prev2 &&j+1<arr2.length){
                
                j++;
            }
            
            while(arr3[k]==prev3 && k+1<arr3.length){
                
                k++;
            }
            
            if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
                
                System.out.print(arr1[i]+" ");
                
                prev1=arr1[i];
                
                prev2=arr2[j];
                
                prev3=arr3[k];
                
                i++; j++; k++;
            }
            
            else if(arr1[i] > arr2[j]){
                
                prev2=arr2[j];
                
                j++;
            }
            
            else if(arr2[j]>arr3[k]){
                
                prev3=arr3[k];
                
                k++;
            }
            
            else{
                
                prev1=arr1[i];
                
                i++;
            }
            
        }
        
        
    }
    
  
	public static void main (String[] args) {
	    
	    int arr1[] = { 1, 5, 10, 20, 40, 80, 80 };
    int arr2[] = { 6, 7, 20, 80, 80, 100 };
    int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };
    int n1 = arr1.length; //sizeof(ar1) / sizeof(ar1[0]);
    int n2 = arr2.length; //sizeof(ar2) / sizeof(ar2[0]);
    int n3 = arr3.length; //sizeof(ar3) / sizeof(ar3[0]);
 
    System.out.println("Common Elements are ");
    findCommon(arr1, arr2, arr3, n1, n2, n3);
    //return 0;
		System.out.println("GfG!");
	}
}
