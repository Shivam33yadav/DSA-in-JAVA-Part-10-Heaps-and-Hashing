
import java.util.*;
public class IIterationOnHashsett {
  public static void main(String[] args) {
       HashSet<String> cities = new HashSet<>();
       cities.add("Delhi");
       cities.add("Mumbai");
       cities.add("Noida");
       cities.add("Bengaluru");

    //   Iterator  it = cities.iterator();
      // while(it.hasNext()) {
        //System.out.println(it.next());
       //}

       //By advanced Loop
       for (String city : cities) {  //foreach
          System.out.println(city);
       }
  }  
} //Unordered  way 
