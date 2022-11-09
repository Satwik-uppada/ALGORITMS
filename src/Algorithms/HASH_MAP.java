package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HASH_MAP {
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<String,Integer>();
        map.put("India",120);
        map.put("China",150);
        map.put("Irfan",170);
        map.put("US",190);

        System.out.println(map);
        map.put("Pakistan",210);
        System.out.println(map);
        if(map.containsKey("Indonesia")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        for(Map.Entry <String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

           // System.out.println();
        }
        Set<String> Keys=map.keySet();
        for(String key : Keys){
            System.out.println(key+" "+map.get(key));
        }
        //removing
        map.remove("china");
        System.out.println(map);
    }
}
