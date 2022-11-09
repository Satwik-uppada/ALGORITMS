package Algorithms;

public class binary_tree_preorder {
        int key;
        binary_tree_preorder left, right;

        public binary_tree_preorder(int item)
        {
            key = item;
            left = right = null;
        }
    }

    class BinaryTree {
        // Root of Binary Tree
        binary_tree_preorder root;

        BinaryTree() { root = null; }

        /* Given a binary tree, print its nodes in preorder*/
        void printPreorder(binary_tree_preorder node)
        {
            if (node == null)
                return;


            System.out.print(node.key + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
        void printPreorder() {
            printPreorder(root);
        }
        public static void main(String[] args)
        {
            BinaryTree tree = new BinaryTree();
            tree.root = new binary_tree_preorder(1);
            tree.root.left = new binary_tree_preorder(2);
            tree.root.right = new binary_tree_preorder(3);
            tree.root.left.left = new binary_tree_preorder(4);
            tree.root.left.right = new binary_tree_preorder(5);


            System.out.println(
                    "Preorder traversal of binary tree is ");         
            tree.printPreorder();
        }
    }

