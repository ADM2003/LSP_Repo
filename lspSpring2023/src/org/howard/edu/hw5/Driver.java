package org.howard.edu.hw5;

import org.howard.edu.hw4.IntegerSet.EmptyArrayListException;

public class Driver {
	public static void main(String[] args) throws EmptyArrayListException, org.howard.edu.hw5.IntegerSet.EmptyArrayListException {
		IntegerSet set1 = new IntegerSet(); 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Smallest value in Set1 is:" + set1.smallest());
		System.out.println("Largest value in Set1 is:" + set1.largest());
		System.out.println("Length of Set1 is:" + set1.length());

		System.out.println("Does Set1 contain the integer 1?");
		if(set1.contains(1) == true) {
			System.out.println("Set1 does contain the integer 1.");
		}
		else {
			System.out.println("Set1 does not contain the integer 1.");
		}
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		
		System.out.println("Does Set1 equal Set2?");
		if(set1.equals(set2) == true) {
			System.out.println("Set1 does equal Set2");
		}
		else {
			System.out.println("Set1 does not equal Set2");
		}
		
		
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2:");
		System.out.println("Value of Set1 is now: " + set1.toString());
		
		
		System.out.println("Intersection of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		set1.intersect(set2);
		System.out.println("Result of intersection of Set1 and Set2:");
		System.out.println("Value of Set1 is now " + set1.toString());
		
		set1.add(1);
		set1.add(2);
		
		System.out.println("Difference of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		set1.diff(set2);
		System.out.println("Difference of Set1 and Set2:");
		System.out.println("Value of set1 is now " + set1.toString());
		
		System.out.println("Is set1 empty?");
		if (set1.isEmpty()) {
			System.out.println("Set1 is empty.");
		}
		else {
			System.out.println("Set1 is not empty.");
		}
		
		System.out.println("The current value of Set1 is "+ set1.toString());
		System.out.println("Removing the element 1 from Set1.");
		set1.remove(1);
		System.out.println("The current value of Set1 is now "+ set1.toString());
		
		System.out.println("Clearing all elements from Set1.");
		set1.clear();
		System.out.println("The current value of Set1 is now " + set1.toString());
	}
}
