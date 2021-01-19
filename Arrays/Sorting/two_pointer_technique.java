 int findpair(int arr[],int n,int x){
        
        //naive
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                if(arr[i]+arr[j]==x)
                    return 1;
                if(arr[i]+arr[j]>x)
                    break;
            }
        }
        
        return 0;
        
    }
    
    int findpair(int[] arr,int n,int x){
        
        int i=0,j=n-1;
        
       while(i<j){
           
           if(arr[i]+arr[j]==x){
               
               return 1;
               
           }
           
           else if(arr[i]+arr[j]<x){
               
               i++;
               
           }
           
           else{
               
               j--;
           }
            
           
       }
       
       return 0;
        
        
    }
