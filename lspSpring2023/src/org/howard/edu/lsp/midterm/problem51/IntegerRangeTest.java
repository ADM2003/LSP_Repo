package org.howard.edu.lsp.midterm.problem51;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.howard.edu.lsp.midterm.problem51.IntegerRange;
import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerRangeTest {
	IntegerRange range1 = new IntegerRange(1, 5);
	IntegerRange range2 = new IntegerRange(2, 6);
	IntegerRange range3 = new IntegerRange(9, 10);

	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		assertTrue(range1.contains(2));
		assertFalse(range1.contains(7));
	}

	@Test
	@DisplayName("Test case for overlaps")
	public void testOverlaps() throws EmptyRangeException {
		assertTrue(range1.overlaps(range2));
		assertFalse(range1.overlaps(range3));
	}
	
	@Test
	@DisplayName("Test case for size")
	public void testSize() {
		assertTrue(range1.size() == 5);
	}
	
}