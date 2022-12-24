import java.util.HashMap;

public class itineraay_from_tickets {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Chenni","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chenni");
        map.put("Delhi","Goa");
        HashMap<String,String> reversemap=new HashMap<>();
        for(String key:map.keySet()){
            reversemap.put(map.get(key),key);
        }

        String start=null;
        for(String key:map.keySet()){
            if(!reversemap.containsKey(key)){
                start=key;
                break;
            }
        }
       
        while(map.containsKey(start)){
            System.out.print(start+"->");
            start=map.get(start);
        }
        System.out.print(start);
    }
}
