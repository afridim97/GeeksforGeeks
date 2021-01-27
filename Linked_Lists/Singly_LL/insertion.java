class LinkedList {
    
    Node head;
    
    class Node{
        
        int data;
        
        Node next;
        
        Node(int d){
            
            data=d;
            
            next=null;
        }
        
    }
    
    void insertfrombeg(Node head,int key){
        
        Node new_node=new Node(new_data);
        
        if(head==null)
            head=new Node(key);
            
        new_node.next=head;
        
        head=new_node;
            
    }
    
    void insertafter(Node p,int key){
        
        Node new_node=new Node(new_data);
        
        if(p==null)
            return;
            
        new_node.next=p.next;
        
        p.next=new_node;
    }
    
    void insertatend(Node head,int key){
        
        if(head==null)
            head=new Node(key);
            
        new_node.next=null;
        
        Node last=head;
        
        while(last.next!=null)
            last=last.next;
            
        last.next=new_node;
        
    }
}
