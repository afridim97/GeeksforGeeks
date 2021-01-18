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
    
    void delete(Node head,int key){
        
        if(head==null)
            return null;
            
        Node curr=head,prev=null;
        
       while(curr.data!=key){
           
           prev=curr;
       
       if(curr==head){
           
           Node prev=head;
           
           while(prev.next!=head)
                prev=prev.next;
                
            prev.next=curr.next;
       }
        
        if(curr.next==head){
            
            prev.next=head;
            
            head=prev.next;
            
        }
        
        else{
            
            prev.next=curr.next;
        }
        
    }
