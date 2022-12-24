import java.util.*;
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        // Add the pair in the hashmap table
        map.put("india","Delhi");
        map.put("utter pradesh","lucknow");
        map.put("Nepal","Kathmandu");
        map.put("china","beining");
        map.put("pakistan","Islamabad");
        System.out.println(map);

        // Access the value from the specific key
        System.out.println(map.get("Nepal"));

//        // Check the key in hashmap exist or not
        System.out.println(map.containsKey("Nepal"));
        System.out.println(map.containsKey("Bhutan"));
//
//        // check the value in hashmap exist or not
        System.out.println(map.containsValue("lucknow"));
        System.out.println(map.containsValue("Islamabad"));
        System.out.println(map.containsValue("Mala"));

        // Print the key or value of the hashmap using entrySet
        for(Map.Entry<String, String> e:map.entrySet())
        {
            System.out.print(e.getKey()+"=");
            System.out.println(e.getValue());
        }

        // print the value of the hashmap using keyset() function
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
         // Delete the value from the specific key using remove function
        map.remove("pakistan");
        System.out.println(map);



    }
}
