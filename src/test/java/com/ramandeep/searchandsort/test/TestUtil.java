package com.ramandeep.searchandsort.test;

import com.ramandeep.searchandsort.util.MaxHeap;
import com.ramandeep.searchandsort.util.MinHeap;
import com.ramandeep.searchandsort.util.UnsortedArrayProvider;

public class TestUtil {
	public static void main(String[] args) {
		new MaxHeap(UnsortedArrayProvider.getArray(10));
		System.out.println();
		new MinHeap(UnsortedArrayProvider.getArray(10));
	}
}
