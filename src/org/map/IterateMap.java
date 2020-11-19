package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IterateMap {
	public static void main(String[] args) {
		//5.3
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
		Set<Entry<Character,Integer>> x=m2.entrySet();
		for (Entry<Character, Integer> y : x) {
			System.out.println(y.getKey());
			System.out.println(y.getValue());
		}
		
		Hashtable<String,String> h=new Hashtable<String, String>();
		
		h.put("Vel","Selenium");
		h.put("Ganesh","Framework");
		h.put("Dinesh","Oracle");
		h.put("Vengat","Corejava");
		h.put("Subash","jira");
		
		System.out.println("Hashtable="+h);
		Set<Entry<String,String>> e=h.entrySet();
		for (Entry<String,String> f : e) {
			System.out.println(f.getKey());
			System.out.println(f.getValue());
		}
		
		
	/*	Map<Integer, String> m=new HashMap<Integer,String>();
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
		Set<Entry<Integer,String>> a=m.entrySet();
		for (Entry<Integer, String> b : a) {
			System.out.println(b.getKey());
			System.out.println(b.getValue());
		}
			
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
			Set<Entry<Integer,Integer>> c=m1.entrySet();
			for (Entry<Integer, Integer> d : c) {
				System.out.println(d.getKey());
				System.out.println(d.getValue());
			}*/
		


}}