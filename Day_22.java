public static int getHeight(Node root){
    int temp = temp(root);    
    return (temp == 0) ? 0 : temp - 1;
}

public static int temp(Node root) {
    return (root == null) ? 0 : 1 + Math.max(temp(root.left), temp(root.right));
}
