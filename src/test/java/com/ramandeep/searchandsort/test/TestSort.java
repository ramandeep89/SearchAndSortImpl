package com.ramandeep.searchandsort.test;

import java.util.Arrays;

import com.ramandeep.searchandsort.sort.MergeSort;
import com.ramandeep.searchandsort.sort.Sort;
import com.ramandeep.searchandsort.util.UnsortedArrayProvider;

public class TestSort {
	public static void main(String[] args) {
		int[] array = UnsortedArrayProvider.getArray(10);
		//int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println(Arrays.toString(array));
		Sort sort = new MergeSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
