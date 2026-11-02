
import java.util.*;
public class AOperations {
    public static void main(String[] args) {
        //CREATE
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Insert elements -> O(1)
        hm.put("India", 100);  //hashmap
        hm.put("China", 150);
        hm.put("US",50);

        System.out.println(hm);

        //Get operation -> O(1)  jb value exist kregi tbhi ret krega otherwise null
       int population =  hm.get("India");  // jiski value chiye wo mil jaegi
       System.out.println(population);

       System.out.println(hm.get("Indonesia"));  // gives null value
       
       // contains key - O(1) check ki kya map k andr meri koi key exist krti h jbki get directy value de deta h aur ye true/false
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("Indonesia"));

       //Remove operation - //key, value dono ka pair delete 
       System.out.println(hm.remove("China"));
       System.out.println(hm);

       //size
       System.out.println(hm.size());

       //is empty kya hashmap khali h
       System.out.println(hm.isEmpty());

       //clear fun -> poore Hashmap ko khali
       hm.clear();
       System.out.println(hm.isEmpty());
    }
}
