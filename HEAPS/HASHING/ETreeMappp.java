
import java.util.*;
public class ETreeMappp {
     public static void main(String[] args) {
        TreeMap<String, Integer>  tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China",150);
        tm.put("US", 50);
        tm.put("Indonesia",80);

        //compare with hashMap
        HashMap<String, Integer>  hm = new LinkedHashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US", 50);

        System.out.println(hm); //Unordered
        System.out.println(tm); //Orderd (alphabetical order)

        //same time complexity 
    }
}


