package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.QuickSort;

public class QuickSortTest {
	QuickSort quick = Mockito.spy(QuickSort.class);


	@Test
	public void validateQuickSort() {
		int vetor[] = {1,87,50,15};
		int[] expected = {1,15,50,87};
		int[] result = quick.quicksort(vetor, 0, 3);
		Assert.assertEquals(expected[0], result[0]);	
		Assert.assertEquals(expected[1], result[1]);	
		Assert.assertEquals(expected[2], result[2]);
		Assert.assertEquals(expected[3], result[3]);	
	}

}
