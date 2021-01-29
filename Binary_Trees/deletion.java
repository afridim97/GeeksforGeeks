/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Tree {
    
    static class Node{
        
        int key;
        
        Node left,right;
        
        Node(int key){
            
            this.key=key;
            left=null;
            right=null;
        }
        
    }
    
    static Node root;
    
   /* void levelorderinsertion(Node root,int key){
        
        if(root==null)
            return;
            
        Queue<Node> q=new LinkedList<Node>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            Node temp=q.poll();
            
            if(temp.left==null)
                temp.left=new Node(key);
            else
                q.add(temp.left);
                
            //likewise
            
            
            
        }*/
        
        public static void inorder(Node root){
            
            if(root==null)
                return;
                
            inorder(root.left);
            
            System.out.print(root.key+" ");
            
            inorder(root.right);
            
            
        }
        
        public static void deleteDeepest(Node root,Node delNode){
            
            if(root==null)
                return;
                
            Queue<Node> q=new LinkedList<Node>();
            
            q.add(root);
            
            while(!q.isEmpty()){
                
                Node temp=q.poll();
                
                if(temp==delNode){
                    
                    temp=null;
                    break;
                    
                }
                
                else{
                    
                    if(temp.right!=null){
                        
                        if(temp.right==delNode){
                            
                            temp.right=null;
                            break;
                            
                        }
                        else{
                            
                            q.add(temp.right);
                        }
                        
                    }
                    
                    if(temp.left!=null){
                        
                        if(temp.left==delNode){
                            
                            temp.left=null;
                            break;
                        }
                        
                        else{
                            q.add(temp.left);
                        }
                    }
                    
                }
                
            }
            
            
        }
        
        public static void delete(Node root,int key){
            
            if(root==null)
                return;
                
            if(root.left==null && root.right==null){
                
                if(root.key==key)
                    return;
                else
                    return;
            }
                
            Queue<Node> q=new LinkedList<Node>();
            
            q.add(root);
            
            Node temp=null,keyNode=null;
            
            while(!q.isEmpty()){
                
                temp=q.poll();
                
               if(temp.key==key){
                   
                   keyNode=temp;
                   
               }
               
               if(temp.left!=null){
                   
                   q.add(temp.left);
               }
               
               if(temp.right!=null){
                   
                   q.add(temp.right);
               }
                
                
            }
            
            if(keyNode!=null){
                
                int x=temp.key;
                deleteDeepest(root,temp);
                keyNode.key=x;
            }
            
            
            
            
        }
        
        
        
    
	public static void main (String[] args) {
	    
	    root = new Node(10);  
    root.left = new Node(11);  
    root.left.left = new Node(7); 
    root.left.right = new Node(12); 
    root.right = new Node(9);  
    root.right.left = new Node(15);  
    root.right.right = new Node(8);  
  
    System.out.print("Inorder traversal " + 
                     "before deletion:");  
    inorder(root);  
  
    int key = 11;  
    delete(root, key);  
  
    System.out.print("\nInorder traversal " + 
                     "after deletion:");  
    inorder(root);
		System.out.println("GfG!");
	}
}
