package org.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
 
public class Maps{ 


	public static void main(String args[])  {  

		HashMap<Integer, String> p =new HashMap<Integer, String>();  
  

		p.put(23, "Naresh");  
		p.put(17, "Regan");  
		p.put(1 ,  "Ajay");  
		p.put(9,  "Raghu");  

		Iterator <Integer> it = p.keySet().iterator();         
		
		System.out.println("Before Sorting");
		while(it.hasNext())  {  
			int key=(int)it.next();  
			System.out.println("Roll no:  "+key+"   Name:   "+p.get(key));  
}  
		
		System.out.println("\n");  

		Map<Integer, String> map =new HashMap<Integer, String>();  
		System.out.println("After Sorting");  
		
		TreeMap<Integer,String> tm =new  TreeMap<Integer,String> (p);  
		Iterator itr= tm.keySet().iterator();               
		
		while(itr.hasNext())    {    
			int key=(int)itr.next();  
			System.out.println("Roll no:  "+key+"   Name:   "+p.get(key));  
	
		}}}    
  


