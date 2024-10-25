package _27_Hash_implemention;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

public class _1 {
        static class HashMap<K, V> { // generics
            private class Node {
                K key;
                V value;

                public Node(K key, V value) {
                    this.key = key;
                    this.value = value;
                }
            }

            private int n; //n - nodes
            private int N;  // N - bukets
            private LinkedList<Node> buckets[]; // N = bukets.lenght

            @SuppressWarnings("unchecked")
            public HashMap() {
                this.N = 4;
                this.buckets = new LinkedList[4];
                for (int i = 0; i < 4; i++) {
                    this.buckets[i] = new LinkedList<>();
                }
            }


            private int hashFuction(K key) { // always 0 to N-1
                int bi = key.hashCode();
                // it can retrun any value + or _
                // for - value to + value
                return Math.abs(bi) % N;
            }


            private int searchInLL(K key, int bi) {
                LinkedList<Node> ll = buckets[bi];

                for (int i = 0; i < ll.size(); i++) {
                    if (ll.get(i).key == key) {
                        return i;
                    }
                }
                return -1;
            }
            @SuppressWarnings("unchecked")
            private void rehash() {
                LinkedList<Node> oldBuckets[] = buckets;
                buckets = new LinkedList[N * 2];

                for (int i = 0; i < N * 2; i++) {
                    buckets[i] = new LinkedList<>();
                }

                for (int i = 0; i < oldBuckets.length; i++) {
                    LinkedList<Node> ll = oldBuckets[i];
                    for (int j = 0; j < ll.size(); j++) {
                        Node node = ll.get(j);
                        put(node.key, node.value);
                    }
                }
            }


            public void put(K key, V value) {
                int bi = hashFuction(key); // buckets index
                int di = searchInLL(key, bi); // data index // di = -1

                if (di == -1) { // key does not extis
                    buckets[bi].add(new Node(key, value));
                    n++;
                } else { // key extis
                    Node node = buckets[bi].get(di);
                    node.value = value;
                }

                double lambda = (double) n / N;
                if (lambda > 2.0) {
                    // rehashing
                }
            }

            public boolean containsKey(K key) {
                int bi = hashFuction(key); // buckets index
                int di = searchInLL(key, bi); // data index // di = -1

                if (di == -1) { // key does not extis
                    return false;
                } else { // key extis
                    return true;
                }
            }

            public V remove(K key) {
                int bi = hashFuction(key); // buckets index
                int di = searchInLL(key, bi); // data index // di = -1

                if (di == -1) { // key does not extis
                    return null;
                } else { // key extis
                    Node node = buckets[bi].remove(di);
                    n--;
                    return node.value;
                }
            }


            public V get(K key) {
                int bi = hashFuction(key); // buckets index
                int di = searchInLL(key, bi); // data index // di = -1

                if (di == -1) { // key does not extis
                    return null;
                } else { // key extis
                    Node node = buckets[bi].get(di);
                    return node.value;
                }
            }

            public ArrayList<K> keyset() {
                ArrayList<K> keys = new ArrayList<>();

                for (int i = 0; i < buckets.length; i++) {
                    LinkedList<Node> ll = buckets[i];
                    for (int j = 0; j < ll.size(); j++) {
                        Node node = ll.get(j);
                        keys.add(node.key);
                    }
                }
                return keys;
            }


            public boolean isEmpty() {
                return n == 0;
            }
        }

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("india", 190);
            map.put("china", 200);
            map.put("us", 50);

            ArrayList<String> keys = map.keyset();
            for (int i = 0; i < keys.size(); i++) {
                System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
            }

            map.remove("india");
            System.out.println(map.get("india"));
        }
    }





