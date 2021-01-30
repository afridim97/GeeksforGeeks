/*package whatever //do not write package name here */

import java.io.*;

class Tree {

class Node{
    
    int key;
    
    Node left,right;
    
    class Node(int  key){
        
        this.key=key;
        
        left=null;
        
        right=null;
    }
    
}
    
    static Node[] created=new Node[10];
    
    static Node root;
    
    public static void createNode(int[] parent,i,Node[] created[]){
        
        if(created[i]!=null){
            
            return;
        }
        
        created[i]=new Node(i);
        
        if(parent[i]==-1){
            
            root=curated[i];
            return;
        }
        
        if(created[parent[i]]==null){
            
            created[parent[i]]=createNode(parent,parent[i],created[parent[i]]);
            
        }
        
        Node p=created[parent[i]];
        
        if(p.left==null){
            
            p.left=created[i];
            return;
        }
        
        else if(p.right==null){
            
            p.right=created[i];
            return;
        }
        
        return;
        
    }
    
    public static Node createTree(Node[] created,Node root){
        
        for(int i=0;i<created.length;i++){
            
            created[i]=null;
        }
        
        for(int i=0;i<created.length;i++){
            
            createNode(parent,i,created[i]);
        }
        
        return root;
    }
    
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
