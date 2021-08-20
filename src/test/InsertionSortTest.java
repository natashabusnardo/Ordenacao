package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.InsertionSort;

public class InsertionSortTest {
	InsertionSort bubble = Mockito.spy(InsertionSort.class);
	
	@Test
	public void validateInsertionSort() {
		int vetor[] = {1,87,50,15};
		int[] expected = {1,15,50,87};
		int[] result = bubble.insertionSort(vetor);
		Assert.assertEquals(expected, result);	
	}
}