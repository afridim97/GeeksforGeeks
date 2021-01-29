 void insert(Node root,int key){
        
        Node root=new Node(key);
        
        if(root==null)
            return;
            
        Queue<Node> q=new Queue<Node>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            Node temp=q.peek();
            
            q.remove();
            
            if(temp.left==null)
                temp.left=new Node(key);
            else
                q.add(temp.left);
            
            
            //likewise for right
        }
        
        
    }
