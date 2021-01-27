void deleteatpos(int pos){
        
        Node temp=head;
        
        for(int i=0;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        
        prev.next=temp.next;
        
        return;
        
    }
