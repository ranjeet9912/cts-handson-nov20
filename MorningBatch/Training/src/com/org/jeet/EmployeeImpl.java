package com.org.jeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeImpl {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		// TODO Auto-generated method stublias
		list.add(new Employee(1,"David",5000));
		list.add(new Employee(7,"Edward",7000));
		list.add(new Employee(1,"Bill",52000));
		list.add(new Employee(2,"Disuja",60000));
		list.add(new Employee(3,"Daniel",8000));
		System.out.println("###########***print in inserted order***#########");
	      list.forEach(Empl-> System.out.println(Empl));
	    
		System.out.println("###########***print in sorted order by name order***#########");
	      Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
	      list.forEach(e1->System.out.println(e1));
	    
	    System.out.println("###########***print in sorted order by Id order***#########");
	      Collections.sort(list,(l1,l2)->l1.getId()-l2.getId());
		  list.forEach(m->System.out.println(m));
        System.out.println("*********Sorted the list by salary in assending order*****");
        Collections.sort(list,(c1,c2)->c2.getSalary()-c1.getSalary());
        list.forEach(o->System.out.println(o));
		 
	 
		

	}

}
