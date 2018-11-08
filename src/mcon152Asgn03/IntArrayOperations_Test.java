package mcon152Asgn03;

import static org.junit.Assert.*; 
import org.junit.Test;

public class IntArrayOperations_Test {

	//tests the max method if it returns the highest int
	@Test
	public void ListOf789Returns9()
	{
		int[] arr = {7, 8, 9};
		assertEquals(9, IntArrayOperations.Max(arr));
	}
	//tests the max method if it returns the highest int even if there are duplicates
	@Test
	public void ListWithDuplicatesReturnsMax()
	{
		int[] arr = { 2, 4, 4, 3};
		assertEquals(4, IntArrayOperations.Max(arr));
	}
	//tests the max method if it returns the highest int even if there are negatives
	@Test
	public void ListWithNegativesGivesMax()
	{
		int[] arr = { -3, -9, -12 };
		assertEquals(-3, IntArrayOperations.Max(arr));
	}
	//tests the min method if it returns the lowest int
	@Test
	public void ListOf789Returns7()
	{
		int[] arr = {7, 8, 9};
		assertEquals(7, IntArrayOperations.Min(arr));
	}
	//tests the min method if it returns the lowest int even if there are duplicates
	@Test
	public void ListWithDuplicatesReturnsMin()
	{
		int[] arr = { 2, 2, 4, 3};
		assertEquals(2, IntArrayOperations.Min(arr));
	}
	//tests the min method if it returns the lowest int even if there are negatives
	@Test
	public void ListWithNegativesGivesMin()
	{
		int[] arr = { -3, -9, -12 };
		assertEquals(-12, IntArrayOperations.Min(arr));
	}
	//tests the sum method if it returns the sum
	@Test
	public void ListOf789Returns24()
	{
		int[] arr = {7, 8, 9};
		assertEquals(24, IntArrayOperations.Sum(arr));
	}
	//tests the sum method if it returns the sum even if there are zeros
	@Test
	public void ListWithZerosReturnsSum()
	{
		int[] arr = { 0, 1, 0, 3};
		assertEquals(4, IntArrayOperations.Sum(arr));
	}
	//tests the sum method if it returns the sum even if there are negatives
	@Test
	public void ListWithNegativesGivesSum()
	{
		int[] arr = { -3, -9, -12 };
		assertEquals(-24, IntArrayOperations.Sum(arr));
	}
	@Test
	public void ListOf789Returns3()
	{
		int[] arr = {7, 8, 9};
		assertEquals(24, IntArrayOperations.Range(arr));
	}
	//tests the sum method if it returns the sum even if there are zeros
	@Test
	public void ListWithDuplicatesReturnsRange()
	{
		int[] arr = { 2, 2, 4, 3};
		assertEquals(2, IntArrayOperations.Range(arr));
	}
	//tests the sum method if it returns the sum even if there are negatives
	@Test
	public void ListWithNegativesGivesRange()
	{
		int[] arr = { -3, -9, -12 };
		assertEquals(-24, IntArrayOperations.Range(arr));
	}
	
}


