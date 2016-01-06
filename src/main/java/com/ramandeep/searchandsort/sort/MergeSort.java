package com.ramandeep.searchandsort.sort;

import com.ramandeep.searchandsort.util.ArrayModifier;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] array) {
		mergeSort(array, 0, (array.length - 1) / 2, array.length - 1);
	}

	/**
	 * 
	 * @param array
	 * @param p:
	 *            beginning element of array1
	 * @param q:
	 *            ending element of array1
	 * @param r:
	 *            ending element of array2
	 */
	private void mergeSort(int[] array, int p, int q, int r) {
		if (!(p == q && q == r)) {
			mergeSort(array, p, (p + q) / 2, q);
			mergeSort(array, q + 1, (q + 1 + r) / 2, r);
		}
		merge(array, p, q, r);
	}

	/**
	 * 
	 * @param array
	 * @param p:
	 *            beginning element of array1
	 * @param q:
	 *            ending element of array1
	 * @param r:
	 *            ending element of array2
	 */
	private void merge(int[] array, int p, int q, int r) {
		if (!(p == q && q == r)) {
			int n1 = p;
			int n2 = q + 1;
			while (n1 < n2 && n1 <= n2 + q && n2 <= r) {
				if (array[n1] > array[n2]) {
					ArrayModifier.rotateRight(array, n1, n2);
					n2++;
				}
				n1++;
			}
		}
	}
}
