class GFG {
    
    sortbyfrequency(int[] arr, int n){
        
        HashMap<Integer,Integer> map=new HashMap();
        
        ArrayList<Integer> output=new ArrayList();
        
        int count=0;
        
        for(int i=0;i<n;i++){
            
            map.put(i,arr[i]);
            
        }
        
        for(int i=0;i<n;i++){
            
            count=map.getOrDefault(i,0);
            
            map.put(i,count+1);
            
            output.add(arr[i]);
            
        }
        
        SortComparator comp=new SortComparator(map);
        
        for(int i=0;i<output.length;i++)
            System.out.print(arr[i]);
        
    }
    
    class SortComparator implements Comparator<Integer>{
        
        HashMap<Integer,Integer> freqmap=new HashMap();
        
        SortComparator(HashMap<Integer,Integer> tmap){
            
            this.freqmap=tmap;
        }

    @Override
    
    int compare(int k1,int k2){
        
        
        int freqcompare=freqmap.get(k1).compareTo(freqmap.get(k2));
        
        
    }
        
        
    }
