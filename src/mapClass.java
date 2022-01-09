import com.sun.jdi.Value;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;


public class mapClass {
    public static void main(String[] args){
        HashMap<String, String> hashOne = new HashMap<>();
        hashOne.put("CName", "Infosys");
        hashOne.put("Role","SDE");
        hashOne.put("EName","Shaik");
        hashOne.put("ID","11805521");
        hashOne.put("Age","20");
        System.out.println("HashMap: "+ hashOne);
        hashOne.put("EName", "Saheb");
        System.out.println(hashOne);

        HashMap<String, String> hashTwo =(HashMap<String,String>) hashOne.clone();

        //clear method
        hashOne.clear();
        System.out.println("Cleared HashMap: "+hashOne);

        System.out.println("HashMap Clone: "+hashTwo);

        //isEmpty method
        System.out.println("Empty Check: "+ hashTwo.isEmpty());

        //size method
        System.out.println("Size Of Hashmap: "+ hashTwo.size());
        System.out.println(("Size of HashMap: "+ hashOne.size()));

        //putAll method
        hashOne.putAll(hashTwo);
        System.out.println("hashTwo elements into hashOne: "+hashOne);

        //replaceAll Method
        hashOne.replaceAll((Key, Value)-> Value.toUpperCase()) ;
        System.out.println("Changed all values to UpperCase: "+hashOne);

        //get method
        System.out.println("get value from HaShMap: "+ hashOne.get("CName"));

        //getOrDefault method
        System.out.println("get value Default: "+ hashOne.getOrDefault("MyName","Not Found"));

        //forEach method
        hashOne.forEach((Key,Value)-> {Value = Value.toLowerCase();
        System.out.println(Value);});

        //compute method
        hashOne.compute("CName",(key,value)-> value = "CapGemini");
        System.out.println("update the hashMap: "+ hashOne);

        // key and value methods
        String[] array = new String[hashOne.size()];
        array = hashOne.keySet().toArray(new String[0]);
        System.out.println("HashMap keys to array: "+Arrays.toString(array));
        System.out.println("Keys: "+ hashOne.keySet());
        System.out.println("Values: "+ hashOne.values());


    }
}
