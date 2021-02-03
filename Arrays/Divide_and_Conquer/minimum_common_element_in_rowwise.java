/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    private static int M=4;
    
    private static int N=5;
    
    static int findcommon(int[][] mat){
        
        int column[]=new int[N];
        
        for(int i=0;i<N;i++){
            
            column[i]=N-1;
        }
        
        //smallest element in the last column of all rows
        //because matrix is sorted row-wise in increasing order
        
        
        int min_row=0;
        
        for(int i=0;i<M;i++){
            
        if(mat[i][column[i]]<mat[min_row][column[min_row]]){
            
            min_row=i;
            //if any row's last column is smaller than the first's, update
        }  
        
        }
        
        //while column being checked in all rows except 
        //min_rows is >=0 
        
        int eq_count=0;
        
        for(int i=0;i<M;i++){
            
            if(column[i]==0){
                
                return -1;
                
            }
            
            if(mat[i][column[i]]>mat[min_row][column[min_row]]){
                
                column[i]-=1;
            }
            
            else{
                
                eq_count++;
            
                }
        
        if(eq_count==M){
            
            break;
            
        }
        
    }
    
    
        
        return mat[min_row][column[min_row]];
    }
    
    
    
    
	public static void main (String[] args) {
	    
	    int mat[][] = { { 1, 2, 3, 4, 5 }, 
                        { 2, 4, 5, 8, 10 }, 
                        { 3, 5, 7, 9, 11 }, 
                        { 1, 3, 5, 7, 9 } }; 
        int result = findcommon(mat); 
        if (result == -1) 
            System.out.print("No common element"); 
        else
            System.out.print("Common element is " + result); 
            
		System.out.println("GfG!");
	}
}
