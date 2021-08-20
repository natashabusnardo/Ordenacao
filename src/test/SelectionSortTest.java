package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.SelectionSort;

public class SelectionSortTest {
	SelectionSort selection = Mockito.spy(SelectionSort.class);
	
	@Test
	public void validateSelectionSort() {
		int vetor[] = {1,87,50,15};
		int[] expected = {1,15,50,87};
		int[] result = selection.selectionSort(vetor);
		Assert.assertEquals(expected, result);	
	}
}
