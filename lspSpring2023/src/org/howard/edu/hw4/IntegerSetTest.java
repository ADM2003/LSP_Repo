package org.howard.edu.hw4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.howard.edu.hw4.IntegerSet.EmptyArrayListException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();
	IntegerSet set3 = new IntegerSet();
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertTrue(set1.toString() == "[1, 2, 3]");
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertTrue(set1.toString() == "[1, 2, 3]");
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws EmptyArrayListException {
		assertTrue(set1.smallest() == 1);
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws EmptyArrayListException{
		assertTrue(set1.largest() == 3);
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertTrue(set1.length() == 3);
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		assertTrue(set1.contains(1));
	}
	
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		set2.add(4);
		set2.add(5);
		set3.add(1);
		set3.add(2);
		set3.add(3);
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		set2.add(4);
		set2.add(5);
		set1.union(set2);
		assertTrue(set1.toString() == "[1, 2, 3, 4, 5]");
	}
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersection() {
		set1.intersect(set2);
		assertTrue(set1.toString() == "[4, 5]");
	}
	
	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.diff(set2);
		assertTrue(set1.toString() == "[1, 2, 3]");
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		set1.remove(3);
		assertTrue(set1.toString() == "[1, 2]");
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		set1.clear();
		assertTrue(set1.toString() == "[]");
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue(set1.isEmpty());
		assertFalse(set3.isEmpty());
	}
}