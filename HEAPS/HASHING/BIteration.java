
import java.util.*;
public class BIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal",5);

        //Iterate
        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        //keyset pr loop lgaya
        for (String k : keys) { //forea -> foreach loop
             System.out.println("Key="+k+ ",value="+hm.get(k));

            
        }
        }
}
