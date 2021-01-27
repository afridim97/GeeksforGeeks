void delete(Node head,int key){
        
        Node temp=head;
        
        if(head==null)
            return;
            
        if(temp==head&&temp.key==key)
            temp=head.next;
            
            head=temp;
            
            return;
        Node prev=null;
        if(temp==head&&temp.key!=key)
            
            //Node prev=null;
            
            prev=temp;
            
            temp=temp.next;
        
        if(temp==null)
            return;
            
        else{
            
            prev.next=temp.next;
        }
        
