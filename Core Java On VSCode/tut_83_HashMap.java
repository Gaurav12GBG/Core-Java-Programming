import java.util.*;
public class tut_83_HashMap {
    public static void main(String[] args) {
        
        // HASHMAP :

        Map<String, String> map = new HashMap<>();
        map.put("Name", "Gaurav");
        map.put("CollegeName", "SNJBKBJCOE");
        map.put("CEO", "Marias");

        //FOLLOWING ARE THE WAY OF ITERATING THE MAP:

        // KeySet()
        Set<String> keys = map.keySet();

        for(String key : keys){

            System.out.println(key + " " + map.get(key));
        }

        // entrySet() way1
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("key " + entry.getKey() + " and value " + entry.getValue());
        }

        //Way2
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            System.out.println("Key = " + entry.getKey() +
                                ", Value = " + entry.getValue());
        }

        //using keySet() and values()
        //Only fetching the keys using keySet() method
        for (String key : map.keySet()) {
            System.out.println("Keys are "+ key);
        }

        //only fetching the values using values() method
        for (String value : map.values()) {
            System.out.println("Values are "+ value);
        }
   
        // forEach(action) method to iterate map
        map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
        
    }
}

