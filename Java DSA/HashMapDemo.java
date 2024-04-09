import java.util.*;
class HashMapDemo
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map = new HashMap<>();

        //Insert values
        map.put("India",125);
        map.put("Russia",465);
        map.put("us",123);

        System.out.println(map);

        //update India values
        map.put("India",345);       //update if entry is exit otherwise insert new values
        System.out.println(map);  

        //Search
        if(map.containsKey("India")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key does not present in the map");
        }

        //get value for specific key
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonessia"));

        //Iteration of HashMap

        System.out.println("Iteration of hashmap");

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());       
        }       //or

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }


            //remove key and values
            map.remove("us");
            System.out.println(map);
    }
}