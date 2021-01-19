class LinkedList {
    
    Node root;
    
    class Node{
        
        int key;
        
        Node next;
        
        class Node(int k){
            
            key=k;
            next=null;
        }
    }
    
    void addtoEmpty(Node last,int key){
    
    if(last!=null)
        return last;
        
    last=new Node(key);
    
    last.next=last;
        
    }
    
    void insertatbeg(Node last,int key){
        
        if(last==null)
            return addtoEmpty(last,key);
            
        Node new_node=new Node(key);
        
        new_node.next=last.next;
        
        last.next=new_node;
        
        //for end, add last=new_node;
        
    }
    
    void insertafter(Node p,Node last,int key,int item){
        
        Node new_node=new Node(key);
        
        if(p==null)
            return;
            
            Node p=last.next;
            
        do{
            if(p.data==item){
                
                new_node.next=p.next;
                
                p.next=new_node;
                
                if(p==last)
                    p=new_node;
                    return;
                
            }while(p!=last.next);
            
            p=p.next;
        }
        
        
    }
    
    
           curr=curr.next;
       }
