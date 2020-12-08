package com.org.jeet;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<String> list=new ArrayList<String>();
	  String[] cars= {"BMW","Tesla","Jaguarr","Hundai","Honda","Mahindra","Tata","Ford","MAruti Suzuki****"};
	   for(String c:cars) {
		   System.out.println(c);
		   list.add(c);
	   }
     list.forEach(d ->System.out.println(d));
     Collections.sort(list);
     list.forEach(d ->System.out.println(d));
	}

}

