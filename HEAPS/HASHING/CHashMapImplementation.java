import java.util.*;

public class CHashMapImplementation {
    static class HashMap<K, V> {  //generic  neans sbke liye chl jaega general....eg boolean,str,int
        private class Node  {
             K key;
             V value;

             public Node(K key, V value) { //constr
                this.key = key;
                this.value = value;
             }
            
        }
        private int n; //n means size
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("unchecked") //faltu warnings nhi aane dega 
        public HashMap() {
           this.N = 4; //size of ll is 4
           
           this.buckets = new LinkedList[4];
           for(int i = 0; i<4; i++) {
            this.buckets[i] = new LinkedList<>(); //initialize with blank ll
           }    
        }
        private int hashFunction( K key){
           int hc = key.hashCode(); //hashcode
           //1234567; -1234567 pr hume to bucket idx chiye
          return Math.abs(hc) % N;
        }
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
           int di = 0; // dataidx

            for(int i = 0; i<ll.size(); i++) {
               Node node = ll.get(i);
               if(node.key == key) {
                return di;
               }
               di++;
            }
            return -1; //key na milne pr
        }
        @SuppressWarnings("unchecked")
        private void rehash() { // purane ds ko optimize banana
           LinkedList<Node> oldBuck[] = buckets;
           buckets = new LinkedList[N*2]; // now the bucket size bacame doubled
           N = 2*N;
           //purani buck se element nikalne and new bucket m add using put()
           for(int i =0; i<buckets.length; i++) {
            buckets[i] = new LinkedList<>();
           }
           //nodes -> add in bucket
           for(int i =0; i<oldBuck.length; i++) {
            LinkedList<Node> ll = oldBuck[i];
            for(int j =0; j<ll.size(); j++) {
                Node node = ll.remove();
                put(node.key, node.value);
            }
           } 
        }
        public void put(K key, V value) { //t.c O(1) // blank function
             //find bucket idx
            int bi = hashFunction(key); //0 to size-1 means 0 to 3
            //ll k upar search krna
            int di = SearchInLL(key,bi); //data idx  valid ; -1

            //ya to di ek valid val hoga ya nhi
            if(di != -1) { //means valid
                Node node = buckets[bi].get(di);
                node.value = value;
            }else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            //rehashing time ?
            double lambda = n/N;
            if(lambda > 2.0) {  //agr lamb ki val threshold(2.0) se bdi tab rehash krna h
                rehash();

            }
        }
        public boolean containsKey(K key) {  //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) { //valid
                return true;
            }else {
               return false;
            }
        }
        public V remove(K key) { //O(1)
             int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) { //valid
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else {
               return null;
            }
        }
        public V get(K key){ //get() returns value  //O(1)
        int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1) { 
                Node node = buckets[bi].get(di);
                return node.value;
            }else {
               return null;
            }
            
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i =0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public  boolean isEmpty() {
            return n == 0;      
        }
    }
   

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal",5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
              System.out.println(key);
        }
        //can perform for specific
        //sout(hm.get("India"));
       // sout(hm.remove("India"))
       //sout(hm.get("India"));    // nulll
        
    }
}
