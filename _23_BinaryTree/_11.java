//package _23_BinaryTree;

// code error but cant find


//// subtree of another tree
//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.*;
//public class _11 {
//    static class Node {
//
//        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
//            if (subRoot == null && root == null) {
//                return true;
//            }
//            if (root == null || subRoot == null) {
//                return false;
//            }
//            if (root.val == subRoot.val) {
//                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
//            }
//            return false;
//        }
//
//        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//            if (subRoot == null) {
//                return true;
//            }
//            if (root == null) {
//                return false;
//            }
//            if (isIdentical(root, subRoot)) {
//                return true;
//            }
//            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//        }
//    }
//}