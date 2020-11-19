package org.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentDetails {
	
public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStdId(1);
		s1.setName("pushpa");
		s1.setPhNo(9864545243l);
		s1.setAddress("Chennai");
		s1.setDob("30.5.1991");
		s1.seteMail("pushpa@gmail.com");
		s1.setGender("Female");
			
		Student s2 = new Student();
		s2.setStdId(2);
		s2.setName("rani");
		s2.setPhNo(9840724242l);
		s2.setAddress("Chengalpattu");
		s2.setDob("23.4.1989");
		s2.seteMail("pushparan4@gmail.com");
		s2.setGender("Female");
		
		Student s3 = new Student();
		s3.setStdId(3);
		s3.setName("raja");
		s3.setPhNo(9840722242l);
		s3.setAddress("Kuwait");
		s3.setDob("13.4.1987");
		s3.seteMail("raja@gmail.com");
		s3.setGender("Male");
				
				
		Student s4 = new Student();
		s4.setStdId(400);
		s4.setName("ragini");
		s4.setPhNo(895454242l);
		s4.setAddress("USA");
		s4.setDob("3.4.1998");
		s4.seteMail("rani4@gmail.com");
		s4.setGender("Female");
		
		
		Student s5 = new Student();
		s5.setStdId(500);
		s5.setName("vignesh");
		s5.setPhNo(945353542l);
		s5.setAddress("Chengalpattu");
		s5.setDob("23.4.1991");
		s5.seteMail("vignesh4@gmail.com");
		s5.setGender("Male");
		
		
		Map<Integer,Student> m = new LinkedHashMap<Integer,Student>();
		m.put(1,s1);
		m.put(2,s2);
		m.put(3,s3);
		m.put(4,s4);
		m.put(5,s5);
		
		
		Set<Entry<Integer,Student>> a = m.entrySet();
		
		for (Entry<Integer, Student> b : a) {
			
			System.out.println("Key is: "+b.getKey());
			System.out.println(b.getValue().getStdId());
			System.out.println(b.getValue().getName());
			System.out.println(b.getValue().getPhNo());
			System.out.println(b.getValue().getAddress());
			System.out.println(b.getValue().getDob());
			System.out.println(b.getValue().geteMail());
			System.out.println(b.getValue().getGender());
			System.out.println();
			
		}
	}


}
