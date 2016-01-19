package com.ramandeep.searchandsort.test;

import java.util.Arrays;

import com.ramandeep.searchandsort.sort.BubbleSort;
import com.ramandeep.searchandsort.sort.HeapSort;
import com.ramandeep.searchandsort.sort.InsertionSort;
import com.ramandeep.searchandsort.sort.MergeSort;
import com.ramandeep.searchandsort.sort.QuickSort;
import com.ramandeep.searchandsort.sort.Sort;
import com.ramandeep.searchandsort.util.UnsortedArrayProvider;

public class TestSort {
	public static void main(String[] args) {
		bubbleSortTest();
		System.out.println();
		insertionSortTest();
		System.out.println();
		mergeSortTest();
		System.out.println();
		heapSortTest();
		System.out.println();
		quickSortTest();
	}

	private static void mergeSortTest() {
		int[] array = UnsortedArrayProvider.getArray(10);
		// int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println("MERGE SORT");
		System.out.println(Arrays.toString(array));
		Sort sort = new MergeSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void insertionSortTest() {
		int[] array = UnsortedArrayProvider.getArray(10);
		// int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println("INSERTION SORT");
		System.out.println(Arrays.toString(array));
		Sort sort = new InsertionSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void bubbleSortTest() {
		int[] array = UnsortedArrayProvider.getArray(10);
		// int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println("BUBBLE SORT");
		System.out.println(Arrays.toString(array));
		Sort sort = new BubbleSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void heapSortTest() {
		int[] array = UnsortedArrayProvider.getArray(10);
		// int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println("HEAP SORT");
		System.out.println(Arrays.toString(array));
		Sort sort = new HeapSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void quickSortTest() {
		int[] array = UnsortedArrayProvider.getArray(10);
		// int[] array = {6, 8, 9, 5, 1, 2, 3, 4, 0, 7};
		System.out.println("QUICK SORT");
		System.out.println(Arrays.toString(array));
		Sort sort = new QuickSort();
		sort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
