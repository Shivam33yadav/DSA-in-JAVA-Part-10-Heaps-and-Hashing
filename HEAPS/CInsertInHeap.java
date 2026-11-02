import java.util.*;

public class CInsertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last idx 
            arr.add(data);
           
            int x = arr.size()-1;  // x is child index
           // int par = (arr.size() - 1 - 1 )/2;
           int  par = (x-1)/2;  // parent idx

           while(arr.get(x) < arr.get(par)) {   //O(logn)  for max heap : use >
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            // swap krne k baad update bhi krna hoga 
            x = par;
            par = (x-1)/2;
           }
        }
        public int peek() {
            return arr.get(0);
        }
        
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;  //for max heap use maxIdx

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {  // for max heap use:< in place of >
                minIdx = left;
            } 

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {  // <  itna change krne par order descending ho jaega
                minIdx = right;

            }
            if(minIdx != i) {
                //swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        //jisko peek kr rhe the usiko delete  Heapify function
        public int remove() {
            int data = arr.get(0);
            
            //step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 = delete last
            arr.remove(arr.size()-1);
            //step 3 - heapify
              heapify(0);
              return data;
        }
        //kya mera heap khali to nhi h
        public boolean isEmpty() {
            return arr.size() == 0;

        }
    }        public static void main(String[] args) {
            Heap h = new Heap();
            h.add(3);  // h ki jagh hum pq.add kre tab bhi same answer hi hoga means isne kaam priority queue wala hi krna 
            h.add(4);
            h.add(1);
            h.add(5);

            while(!h.isEmpty()) {  // also called heap sort
                System.out.println(h.peek());
                h.remove();
            }
        }
    }
