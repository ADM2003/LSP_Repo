package org.howard.edu.hw5;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet() {

	}
	
	public void clear() {
		set.clear();
	};
	
	public int length() {
		return set.size(); 
	};
	
	public boolean equals(IntegerSet b) {
		if(set.size() != b.length()) {
			return false;
		}
		else {
			return set.containsAll(b.set);
		}
	};
	
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	public class EmptyArrayListException extends Exception{
		public EmptyArrayListException(String message) {
			super(message);
		}
		
	}
	public int largest() throws EmptyArrayListException{
		if (set.isEmpty()) {
			throw new EmptyArrayListException("The ArrayList is empty.");
		}
		else {
			int value = set.get(0);
			for(int i = 0; i < set.size(); i++) {
				if (set.get(i) > value) {
					value = set.get(i);
				}
			}
			return value;
		}
	};
	
	public int smallest() throws EmptyArrayListException{
		if (set.isEmpty()) {
			throw new EmptyArrayListException("The ArrayList is empty.");
		}
		else {
			int value = set.get(0);
			for(int i = 0; i < set.size(); i++) {
				if (set.get(i) < value) {
					value = set.get(i);
				}
			}
			return value;
		}
	};
	
	public void add(int item) {
		if (set.contains(item) == false) {
			set.add(item);
		}
	};
	
	public void remove(int item) {
		if (set.contains(item)) {
			int index = set.indexOf(item);
			set.remove(index);
		}
	};
	
	public void union(IntegerSet intSetb) {
		for(int i = 0; i < intSetb.length(); i++) {
			if (set.contains(intSetb.set.get(i)) == false) {
				set.add(intSetb.set.get(i));
			}
		}
	};
	
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	};
	
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			if (set.contains(intSetb.set.get(i))) {
				set.remove(intSetb.set.get(i));
			}
		}
	};
	
	boolean isEmpty() {
		return set.isEmpty();
	};
	
	public String toString() {
		String set_string = "";
		for(int i = 0; i < set.size(); i++) {
			set_string = set_string + set.get(i) + " ";
		}
		return set_string;
	};
	
}