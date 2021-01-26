/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		//code
		
		int[] arr = { 5,5,4,6,4}; 
		
		 HashMap<Integer,Integer> getcount=new HashMap<Integer,Integer>();
        
        ArrayList<Integer> oho=new ArrayList<Integer>();
        
        int count=0, n=arr.length;
        
        for(int i=0;i<n;i++){
            
            count=getcount.getOrDefault(arr[i],0);
            
            getcount.put(arr[i],count+1);
            
            oho.add(arr[i]);
            
        }
        
        SortComparator sorter=new SortComparator(getcount);
        
        
        Collections.sort(oho,sorter); //sorting array based on values compared in the map
        
        for(int i=0;i<oho.size();i++){
            
            System.out.print(oho.get(i)+" ");
            
        }
	}
}

class SortComparator implements Comparator<Integer>{
    
    HashMap<Integer,Integer> freqmap=new HashMap<>();
    
    SortComparator(HashMap<Integer,Integer> tmap){
        
        this.freqmap=tmap;
    }
    
    @Override
    
    public int compare(Integer k1,Integer k2){
        
        int freqcompare=freqmap.get(k2).compareTo(freqmap.get(k1));
        
        int valcompare=k1.compareTo(k2);
        
        if(freqcompare==0)
            return valcompare;
        else
            return freqcompare;
        
    }
    
}
