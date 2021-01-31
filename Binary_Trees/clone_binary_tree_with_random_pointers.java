 public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
 
        root.random = root.right.left.random;
        root.left.left.random = root.right;
        root.left.right.random = root;
        root.right.left.random = root.left.left;
        root.random = root.left;
 
        System.out.println("Preorder traversal of the original tree:");
        preorder(root);
 
        Node clone = cloneSpecialBinaryTree(root);
 
        System.out.println("\nPreorder traversal of the cloned tree:");
        preorder(clone);
    }
