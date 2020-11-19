package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InsertValues {
	public static void main(String[] args) {
		//1.1
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(10,"java");
		m.put(20,"Sql");
		m.put(30,"oops");
		m.put(40,"Sql");
		m.put(50,"oracle");
		m.put(60,"DB");
		m.put(10,"selenium");
		m.put(50,"psql");
		m.put(40,"Hadoop");
		
		System.out.println("HashMap="+m);
		Set<Integer> a=m.keySet();
		//Collection<String> a=m.values();
		System.out.println("Key = "+a);
		//System.out.println("Values="+a);
		for (Integer x : a) {
			System.out.println(x);
		}
		
		System.out.println();
		//1.2
		Map<Integer, Integer> m1=new LinkedHashMap<Integer,Integer>();
		m1.put(10,10);
		m1.put(20,20);
		m1.put(30,30);
		m1.put(40,40);
		m1.put(50,50);
		m1.put(60,60);
		m1.put(10,10);
		m1.put(50,50);
		m1.put(40,40);
		
		System.out.println("LinkedHashMap="+m1);
		Set<Integer> b=m1.keySet();
		//Collection<Integer> b=m1.values();
		//System.out.println("Values="+b);
		System.out.println("Key = "+b);
		for (Integer y : b) {
			System.out.println(y);
		}
		
		System.out.println();
		//1.3
		Map<Character, Integer> m2=new TreeMap<Character,Integer>();
		m2.put('!',10);
		m2.put('@',20);
		m2.put('#',30);
		m2.put('$',40);
		m2.put('%',50);
		m2.put('^',60);		
		m2.put('&',10);
		m2.put('*',50);
		m2.put('(',40);
		
		System.out.println("TreeMap="+m2);
		Set<Character> c=m2.keySet();
		//Collection<Integer> c=m2.values();
		System.out.println("Keys = "+c);
		for (Character z : c) {
			System.out.println(z);
		}
		System.out.println();
		//1.4
		Hashtable<String,String> h=new Hashtable<String, String>();
		
		h.put("Vel","Selenium");
		h.put("Ganesh","Framework");
		h.put("Dinesh","Oracle");
		h.put("Vengat","Corejava");
		h.put("Subash","jira");
		
		System.out.println("Hashtable="+h);
		Set<String> d=h.keySet();
		//Collection<String> d=h.values();
		System.out.println("Keys = "+d);
		for (String q : d) {
			System.out.println(q);
		}
		
		
	}

}

