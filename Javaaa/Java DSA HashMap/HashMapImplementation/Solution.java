package HashMapImplementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    static class HashMapS<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private int n;
        private LinkedList<Node>[] buckets;

        public HashMapS() {
            this.size = 0;
            this.n = 4;
            this.buckets = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % n;
        }

        private int searchInLl(int bi, K key) {
            int di = 0;
            for (Node node : buckets[bi]) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            n = 2 * n;
            buckets = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                buckets[i] = new LinkedList<>();
            }
            size = 0;
            for (int i = 0; i < oldBuckets.length; i++) {
                for (Node node : oldBuckets[i]) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLl(bi, key);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                size++;
            } else {
                buckets[bi].get(di).value = value;
            }
            double lambda = size / n;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLl(bi, key);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLl(bi, key);
            if (di == -1) {
                return null;
            } else {
                size--;
                return buckets[bi].remove(di).value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLl(bi, key);
            if (di == -1) {
                return null;
            } else {
                return buckets[bi].get(di).value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (Node node : buckets[i]) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        HashMapS<String, Integer> map = new HashMapS<>();
        map.put("India", 135);
        map.put("China", 200);
        map.put("US", 75);
        map.put("UK", 20);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        Integer value = map.remove("China");
        System.out.println(value);
        System.out.println(map.containsKey("China"));
        System.out.println(map.get("China"));
    }
}