package com.ramandeep.searchandsort.sort;

import com.ramandeep.searchandsort.util.ArrayModifier;

public class QuickSort implements Sort {

	@Override
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int lo, int hi) {
		if (lo < hi) {
			int q = partition(array, lo, hi);
			quickSort(array, lo, q - 1);
			quickSort(array, q + 1, hi);
		}
	}

	private int partition(int[] array, int lo, int hi) {
		int pivot = array[hi];
		int i = lo - 1;
		for (int j = lo; j < hi; j++) {
			if (array[j] <= pivot) {
				i++;
				ArrayModifier.swapElements(array, i, j);
			}
		}
		ArrayModifier.swapElements(array, i + 1, hi);
		return i + 1;
	}

}
