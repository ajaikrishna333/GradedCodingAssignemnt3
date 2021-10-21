package ServicePackage;

// import java.util.Queue;
// import java.util.LinkedList;

public class ServiceClass {

    Node rootNode = null;
    Node headNode = null;
    Node tailNode = null;

    public void createTree() {
        rootNode = new Node(50);
        rootNode.left = new Node(30);
        rootNode.right = new Node(60);
        rootNode.left.left = new Node(10);
        rootNode.right.left = new Node(55);

        BST_to_right(rootNode);
        traverseSkewed(headNode);
    }

    public void BST_to_right(Node temp) {

        if (temp == null) {
            return;
        }

        BST_to_right(temp.left);

        if (headNode == null) {
            headNode = temp;
        } else {
            tailNode.right = temp;
        }
        temp.left = null;
        tailNode = temp;

        BST_to_right(temp.right);

    }

    private void traverseSkewed(Node headNode) {
        Node temp = headNode;
        System.out.print(temp.data);
        while (temp.right != null) {
            System.out.print(" -> " + temp.right.data);
            temp = temp.right;
        }
    }

}
