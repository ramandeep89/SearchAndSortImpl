package com.ramandeep.searchandsort.sort;

import com.ramandeep.searchandsort.util.ArrayModifier;

public class BubbleSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					ArrayModifier.swapElements(array, j, j - 1);
				}
			}
		}
	}

}
