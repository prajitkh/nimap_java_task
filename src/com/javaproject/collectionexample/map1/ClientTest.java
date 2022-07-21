package com.javaproject.collectionexample.map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.javaproject.collectionexample.map.Department;
import com.javaproject.collectionexample.map.Employee;
import com.javaproject.collectionexample.map.Map;

public class ClientTest {
	public static void main(String[] args) {
		
		Employee ee=new Employee(11,"Rahul",20222);
		Employee e1=new Employee(12,"Ram",2033);
		Employee e3=new Employee(13,"RADHA",20266);
		
		
		Department d1=new Department(1001, "CHEMICAL");
		Department d2=new Department(1002, "CIVIL");
	
	TreeMap<Employee,Department> empDeptMap=new TreeMap<>();
		empDeptMap.put(e3, d1);
		empDeptMap.put(e1, d2);
		
		empDeptMap.put(ee, d1);
		Set<Entry<Employee,Department>>entrySet=empDeptMap.entrySet();
		Iterator<Entry<Employee,Department>> iterator=entrySet.iterator();
		while(iterator.hasNext()) {
		//java.util.Map<Employee, Department> entry=(Map.Entry<Employee, Department>)
		System.out.println(iterator.next());
		}

		
	
		
		
		
		
		
		
	}

}
