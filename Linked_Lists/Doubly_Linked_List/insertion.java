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
    
    void insertatbeg(Node head,int key){
        
        Node new_node=new Node(key);
        
        new_node.prev=null;
        
        if(head==null)
            head=new Node(key);
            
        else{
            
            new_node.next=head;
            
            head.prev=new_node;
            
            head=new_node;
            
        }
    }
    
    void insertafter(Node p,int key){
        
        if(p==null)
            return;
            
        Node new_node=new Node(key);
            
        new_node.next=p.next;
        
        p.next=new_node;
        
        new_node.prev=p;
        
        if(new_node.next!=null)
            new_node.next.prev=new_node;
    
    }
  
    void insertatend(Node head,int key){
        
        if(head==null)
            return;
            
        Node new_node=new Node(key);
            
        Node curr=head;
        
        while(curr.next!=head){
            
            curr=curr.next;
        }
        
        new_node.next=null;
        
        curr.next=new_node;
        
        new_node.prev=curr;

        
    }
