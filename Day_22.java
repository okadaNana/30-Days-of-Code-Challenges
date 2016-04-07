public static int getHeight(Node root){
    if (root == null) {
        return 0;
    }
    
    return Math.max(
        getHeight(root.left) + 1,
        getHeight(root.right) + 1
    );
}
