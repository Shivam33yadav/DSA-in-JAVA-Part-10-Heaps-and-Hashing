
import java.util.*;
public class FMajorityElement {
   public static void main(String[] args) {
    int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
    HashMap<Integer, Integer> map = new HashMap<>(); //key and value both are Integer Type

    for(int i =0; i<arr.length;i++) {
      //  if(map.containsKey(arr[i])) {
        //    map.put(arr[i], map.get(arr[i]) + 1);
        //} else {
          //  map.put(arr[i], 1);
        //}
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); //valid freq ho to wo mil jae arr[i] nhi to val 0 mil jae// yahi kaam h getordefault ka
    }
    //Set<Integer> keySet = map.keySet();
    for (Integer key :  map.keySet()) { //foreach loop  ; key set se Integer val nikalni
        if(map.get(key) > arr.length/3) {
            System.out.println(key);
        }
    }
   } 
}
