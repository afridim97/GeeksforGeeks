
/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG {
    public static Tree convert(Node head, Tree node) {
        // add code here.}
        
        if(head==null){
            
            node=null;
            
            return null;
        }
        
         node=new Tree(head.data);
        
        Queue<Tree> q=new LinkedList<Tree>();
        
        q.add(node);
        
        head=head.next;
        
        Tree leftChild=null,rightChild=null;
        
        while(head!=null){
            
            Tree parent=q.poll();
            
            //head=head.next;
            
            leftChild=new Tree(head.data);
            
            q.add(leftChild);
            
            head=head.next;
            
            if(head!=null){
                
            rightChild=new Tree(head.data);
            
            q.add(rightChild);
            
            head=head.next;
                
            }
            
            parent.left=leftChild;
            
            parent.right=rightChild;
        }
        
        return node;
    }
} 
