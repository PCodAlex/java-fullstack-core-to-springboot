
import java.util.Hashtable;
import java.util.Map;

public class HashMapTable {
    public static void main(String[] args) {
        Map<String,Integer> m=new Hashtable<>();//Hashtable is syncronized (running one thread at a time )
        // Map<String,Integer> m=new HashMap<>();
        m.put("Akash",56);//keys are stored in treeSet and values are stored in to Arraylist
        m.put("Kiran",25);
        m.put("Ankan",36); 
        m.put("Ankan",46); 
        m.put("Anksuk",48);
        
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());

        for(String s:m.keySet()){
            System.out.println(s+" : "+m.get(s));
        }
        
    }    
}
/*
No, you cannot directly use Iterator on a Map
because Map does not extend the Collection interface, and Iterator works only on collections.

But…

You can iterate using:

map.keySet().iterator()

map.values().iterator()

map.entrySet().iterator() ✔ (best way)

Because these return a Set or Collection, which supports Iterator.

🔥 Short reason:

➡️ Iterator works on collections, and Map is not a collection — it is key–value structure.
*/