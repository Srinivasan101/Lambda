package lord;
import java.util.HashMap;

public class Hash_Map {
   public static void main(String[] args) {
      // create a new hash map
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      
      // add key-value pairs to the map
      map.put("John", 32);
      map.put("Alice", 28);
      map.put("Bob", 45);
      
      // retrieve values based on their corresponding keys
      System.out.println("John's age is " + map.get("John"));
      System.out.println("Alice's age is " + map.get("Alice"));
      System.out.println("Bob's age is " + map.get("Bob"));
      
      // iterate over the keys and values in the map
      for (String key : map.keySet()) {
         System.out.println(key + " is " + map.get(key) + " years old.");
      }
   }
}

