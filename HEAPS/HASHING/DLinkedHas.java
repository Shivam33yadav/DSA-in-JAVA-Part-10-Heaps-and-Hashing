
import java.util.*;
public class DLinkedHas {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>  lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China",150);
        lhm.put("US", 50);

        //compare with hashMap
        HashMap<String, Integer>  hm = new LinkedHashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US", 50);

        System.out.println(hm); //Unordered
        System.out.println(lhm); //Orderd

        //same time complexity 
    }
}
