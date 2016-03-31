public static Node insert(Node head, int data) {
    Node newNode = new Node(data);
    
    if (head == null) {
        head = newNode;
    } else {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.next == null) {
                currNode.next = newNode;
                break;
            }
            
            currNode = currNode.next;
        }
    }
    
    return head;
}