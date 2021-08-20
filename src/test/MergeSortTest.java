package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.MergeSort;

public class MergeSortTest {
	MergeSort bubble = Mockito.spy(MergeSort.class);
	
	@Test
	public void validateBubbleSort() {
		int vetor[] = {1,87,50,15};
		int[] expected = {1,15,50,87};
		int[] result = bubble.sort(vetor);
		Assert.assertEquals(expected, result);	
	}

}
