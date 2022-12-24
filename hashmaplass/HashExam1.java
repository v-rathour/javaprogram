import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
public class HashExam1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        // Add the pair in the hashtable using put function
        ht.put(1,"vikash");
        ht.put(2,"akash");
        ht.put(3,"deepak");
        System.out.println(ht);

        // Access the values from the specific key using the get() function
        System.out.println(ht.get(1));

        // Access the data from the hashtable using keySet
        Set<Integer> key=ht.keySet();
       for(Integer i:key){
           System.out.println(ht.get(i));
       }

       // Second methode
        for(Map.Entry<Integer,String> e: ht.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

       //Delete the value from the specific key using the remove() function
        ht.remove(1);
        System.out.println(ht);


        // Add the pair in the hashtable using put() function
        ht.put(5,"vikash");
        ht.put(1,"shyam singh");
        System.out.println(ht);
    }
}
