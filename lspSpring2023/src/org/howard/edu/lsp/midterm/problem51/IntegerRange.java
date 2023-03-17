package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range{
	private int lower;
	private int upper;
	
	IntegerRange(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}
	public boolean contains(int value) {
		if (value >= lower & value <= upper) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public boolean overlaps(Range other) throws EmptyRangeException {
		if (other == null) {
			throw new EmptyRangeException("The Range object is empty.");
		}
		if (Reciever other in Range other) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return (upper - lower) + 1;
	}
}