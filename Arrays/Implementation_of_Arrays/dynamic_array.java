/*package whatever //do not write package name here */

import java.io.*;

class DynamicArray{
    
    private static int size;
    
    private static int count;
    
    private static int[] array;
    
    DynamicArray(){
        
        size=1;
        
        count=0;
        
        array=new int[1];
        
    }
    
    void growSize(){
        
        if(count==size){
            
        int[] temp=new int[2*size];
        
        for(int i=0;i<size;i++){
            
            temp[i]=array[i];
        }
        
        array=temp;
        
        size=size*2;
       
        } 
        
    }
    
     void shrinkSize(){
        
        if(count>0){
            
            int[] temp=new int[count];
            
            for(int i=0;i<count;i++){
                
                temp[i]=array[i];
            }
        
        
        array=temp;
        
        size=count;
        
        }
    }
    
     void add(int data){
        
        if(count==size){
            
            growSize();
        }
        
        else{
            
            array[count]=data;
            
            count++;
            
        }
        
    }
    
     void addAt(int index,int data){
        
        if(count==size){
            
            growSize();
            
        }
        
        for(int i=count-1;i>=index;i--){
            
            array[i+1]=array[i];
        }
        
        array[index]=data;
        
        count++;
        
    }
    
     void remove(){
        
        if(count>0){
            
            array[count-1]=0;
            
            count--;
            
        }
        
        
    }
    
     void removeAt(int index){
        
        if(count>0){
            
            for(int i=index;i<count-1;i++){
                
                array[i]=array[i+1];
            }
            
            array[count-1]=0;
            count--;
            
        }
        
        
    }
	public static void main (String[] args) {
	    
	    DynamicArray da = new DynamicArray(); 
  
        // add 9 elements in array 
        da.add(1); 
        da.add(2); 
        da.add(3); 
        da.add(4); 
        da.add(5); 
        da.add(6); 
        da.add(7); 
        da.add(8); 
        da.add(9); 
  
        // print all array elements after add 9 elements 
        System.out.println("Elements of array:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
  
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " + 
                                              da.count); 
  
        // shrinkSize of array 
        da.shrinkSize(); 
  
        // print all array elements 
        System.out.println("Elements of array "+  
                   "after shrinkSize of array:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " +  
                                               da.count); 
  
        // add an element at index 1 
        da.addAt(1, 22); 
  
        // print Elements of array after adding an 
        // element at index 1 
        System.out.println("Elements of array after" +  
                      " add an element at index 1:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
  
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " +  
                                               da.count); 
  
        // delete last element 
        da.remove(); 
  
        // print Elements of array after delete last  
        // element 
        System.out.println("Elements of array after" +  
                              " delete last element:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
  
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " +  
                                              da.count); 
  
        // delete element at index 1 
        da.removeAt(1); 
  
        // print Elements of array after delete 
        // an element index 1 
        System.out.println("Elements of array after"+  
                      " delete element at index 1:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " + 
                                               da.count); 
    
		System.out.println("GfG!");
	}
}
