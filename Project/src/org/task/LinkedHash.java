package org.task;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHash {
	
	public static void main(String a[]) {
        
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
       
        linkedHashMap.put("One", "First element");
        linkedHashMap.put("Two", "Second element");
        linkedHashMap.put("Three", "Third element");
  
        Set<String> keys = linkedHashMap.keySet();
        
        
        for (String key : keys) {
            System.out.println(key + " -- " + linkedHashMap.get(key));
        }
        
    }
}


