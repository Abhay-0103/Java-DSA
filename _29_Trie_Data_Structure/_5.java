//package _29_Trie_Data_Structure;
//
//// longest word with all prefixess
//
//public class _5 {
//    static class Node {
//        _4.Node[] children;
//        boolean eow;
//
//        public Node() {
//            children = new _4.Node[26];
//            for (int i = 0; i < 26; i++) {
//                children[i] = null;
//            }
//            eow = false;
//        }
//    }
//
//    static _4.Node root = new _4.Node();
//
//
//    // insert the Node
//    public static void insert(String word) {
//        _4.Node curr = root;
//        for (int i = 0; i < word.length(); i++) {
//            int idx = word.charAt(i) - 'a';
//
//            if (curr.children[idx] == null) {
//                //add new Node
//                curr.children[idx] = new _4.Node();
//            }
//            if (i == word.length() - 1) {
//                curr.children[idx].eow = true;
//            }
//            curr = curr.children[idx];
//        }
//    }
//
//    public static boolean search(String key) {
//        _4.Node curr = root;
//        for (int i = 0; i < key.length(); i++) { //O(L); L = key length
//            int idx = key.charAt(i) - 'a';
//            _4.Node node = curr.children[idx];
//
//            if (node == null) {
//                return false;
//            }
//            if (i == key.length() - 1 && node.eow == false) {
//                return false;
//            }
//
//            curr = curr.children[idx];
//        }
//
//        return true;
//    }
//
//    public static void longestWord(Node root, StringBuilder curr) {
//
//
//        for (int i = 0; i < 26; i++) {
//            if (root.children[i] != null && root.children[i].eow == true) {
//                curr.append((char) (i + 'a'));
//                if (curr.length() ans.length()){
//                    ans = curr.toString();
//                }
//                longestWord(root.children[i], curr);
//                curr.deleteCharAt(curr.length() - 1);
//            }
//        }
//    }
//
//    public static String ans = "";
//
//    public static void main(String args[]) {
//        String str[] = {"a", "banana", "app", "ap", "apply", "apple"};
//        for (int i = 0; i < str.length; i++) {
//            insert(str[i]);
//        }
//
//        longestWord(root, new StringBuilder(str:""));
//        System.out.println(ans);
//    }
//}
