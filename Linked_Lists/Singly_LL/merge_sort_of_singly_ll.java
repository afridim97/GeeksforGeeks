 static Node mergeSort(Node head)
    {
      if(head==null || head.next==null)
        return head; //base case for recursion
        
        Node middle=getMiddle(head);
        
        Node nextofmiddle=middle.next;

        middle.next=null;
        
        Node left=mergeSort(head);
        
        Node right=mergeSort(nextofmiddle);
        
        Node sortedList=sortedMerge(left,right);
    
        return sortedList; // add your code here
    }
    
    static Node getMiddle(Node head){
        
        if(head==null)
            return null;
            
        Node slow=head,fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        return slow;
        
    }
    
    static Node sortedMerge(Node headA,Node headB){
        
        Node dummyNode=new Node(0);
        
        Node tail=dummyNode;
        
        while(true){
            
            if(headA==null){
                
                tail.next=headB;
                
                break;
            }
            
            if(headB==null){
                
                tail.next=headA;
                
                break;
            }
            
            if(headA.data<headB.data){
                
                tail.next=headA;
                
                headA=headA.next;
            }
            
            else{
                
                tail.next=headB;
                headB=headB.next;
            }
            
            tail=tail.next;
        }
        
        return dummyNode.next;
