package org.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("pushpa");
		e1.setPhNo(9864545243l);
		e1.setAddress("Chennai");
		e1.setDob("30.5.1991");
		e1.setDoj("12.11.2019");
		e1.seteMail("pushpa@gmail.com");
		e1.setGender("Female");
		e1.setSalary(45000.45);
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setName("rani");
		e2.setPhNo(9840724242l);
		e2.setAddress("Chengalpattu");
		e2.setDob("23.4.1989");
		e2.setDoj("12.11.2014");
		e2.seteMail("pushparan4@gmail.com");
		e2.setGender("Female");
		e2.setSalary(35000.45);
		
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setName("raja");
		e3.setPhNo(9840722242l);
		e3.setAddress("Kuwait");
		e3.setDob("13.4.1987");
		e3.setDoj("12.11.2000");
		e3.seteMail("raja@gmail.com");
		e3.setGender("Male");
		e3.setSalary(100000.45);
		
				
		Employee e4 = new Employee();
		e4.setEmpId(400);
		e4.setName("ragini");
		e4.setPhNo(895454242l);
		e4.setAddress("USA");
		e4.setDob("3.4.1998");
		e4.setDoj("12.8.2020");
		e4.seteMail("rani4@gmail.com");
		e4.setGender("Female");
		e4.setSalary(67000.45);
		
		Employee e5 = new Employee();
		e5.setEmpId(500);
		e5.setName("vignesh");
		e5.setPhNo(945353542l);
		e5.setAddress("Chengalpattu");
		e5.setDob("23.4.1991");
		e5.setDoj("12.11.2015");
		e5.seteMail("vignesh4@gmail.com");
		e5.setGender("Male");
		e5.setSalary(35000.45);
		
		Map<String,Employee> m = new LinkedHashMap<String,Employee>();
		m.put("1",e1);
		m.put("2",e2);
		m.put("3",e3);
		m.put("4",e4);
		m.put("5",e5);
		
		
		Set<Entry<String,Employee>> a = m.entrySet();
		
		for (Entry<String, Employee> b : a) {
			
			System.out.println("Key is: "+b.getKey());
			System.out.println(b.getValue().getEmpId());
			System.out.println(b.getValue().getName());
			System.out.println(b.getValue().getPhNo());
			System.out.println(b.getValue().getAddress());
			System.out.println(b.getValue().getDob());
			System.out.println(b.getValue().getDoj());
			System.out.println(b.getValue().geteMail());
			System.out.println(b.getValue().getGender());
			System.out.println(b.getValue().getSalary());
			System.out.println();
			
		}
	}

}
