import java.util.LinkedList;
import java.util.ArrayList;
public class CustomHashmap1{
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>[] buckets;
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = (LinkedList<Node>[]) new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
          }
     }
        private int hashFunction(K key){
            return Math.abs(key.hashCode()) % N;
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++){
                if (ll.get(i).key.equals(key)){
                    return i;
            }
         }
          return -1;
     }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            N *= 2;
            buckets = (LinkedList<Node>[]) new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            n = 0;
            for(LinkedList<Node> ll : oldBuckets){
                for(Node node : ll){
                    put(node.key, node.value);
             }
        }
    }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                buckets[bi].get(di).value = value;
         }
            double lambda = (double) n / N;
            if(lambda > 2.0) {
                rehash();
            }
     }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1){
                return null;
            }else{
                return buckets[bi].get(di).value;
            }
        }
        public boolean contains(K key){
            return searchInLL(key, hashFunction(key)) != -1;
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
         }
      }
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
     }
 }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("Austria", 90);
        map.put("Japan", 290);
        ArrayList<String> keys = map.keyset();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
     }
   }
}
