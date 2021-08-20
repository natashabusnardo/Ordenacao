package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.BubbleSort;

public class BubbleSortTest {
	BubbleSort bubble = Mockito.spy(BubbleSort.class);
	
	@Test
	public void validateBubbleSort() {
		int vetor[] = {1,87,50,15};
		int[] expected = {1,15,50,87};
		int[] result = bubble.bubbleSort(vetor);
		Assert.assertEquals(expected, result);	
	}
}
