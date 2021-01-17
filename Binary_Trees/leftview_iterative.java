void leftview_iterative(Node root){
        
        if(root==null)
            return;
            
        Queue<Node> q=new Queue<Node>();
        
        q.add(root);
        
        int n=q.size();
        
        while(!q.isEmpty()){
            
            for(int i=0;i<n;i++){
                
                Node temp=q.poll();
                
                q.remove();
                
                if(i==0)
                    System.out.print(q.key+" ");
                    
                if(temp.left!=null)
                    q.add(temp.left);
                //likewise for temp.right
        
            }
         }   
            
        }
