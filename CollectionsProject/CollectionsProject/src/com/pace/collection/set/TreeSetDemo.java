package com.pace.collection.set;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> citySet = new TreeSet<String>();
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Bengaluru");
		citySet.add("Hyderabad");
		
		for(String city : citySet) {
			System.out.println(city);
		}
		

	}

}
