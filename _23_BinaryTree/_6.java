package _23_BinaryTree;

// count of nodes
// first 1 sab root ka ketha nose hai check kar tha hai
// fir uss root ka jo parent node hai usmeh jabtha hai
// sam right aur left sab tree meh hota hai and last total
// 1 root ka ketha node hai woh dekh tha hai
import java.util.LinkedList;
import java.util.Queue;

public class _6 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);

        while (!Q.isEmpty()) {
            Node currNode = Q.remove();
            if (currNode == null) {
                System.out.println();
                if (Q.isEmpty()) {
                    break;
                } else {
                    Q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    Q.add(currNode.left);
                }
                if (currNode.right != null) {
                    Q.add(currNode.right);
                }
            }
        }
    }

    public static int countofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int Nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);

        System.out.println(countofNodes(root));
    }
}
