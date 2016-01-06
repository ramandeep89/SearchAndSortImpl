package com.ramandeep.searchandsort.sort;

import com.ramandeep.searchandsort.util.ArrayModifier;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[i] <= array[j]) {
					ArrayModifier.rotateRight(array, j, i);
				}
			}
		}
	}

}
