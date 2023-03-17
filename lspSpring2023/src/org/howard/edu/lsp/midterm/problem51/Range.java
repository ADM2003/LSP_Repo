package org.howard.edu.lsp.midterm.problem51;

public interface Range{
	
public class EmptyRangeException extends Exception{
	public EmptyRangeException(String message) {
		super(message);
	}
}
	public boolean contains(int value);
	
	public boolean overlaps(Range other) throws EmptyRangeException;
	
	public int size();
}