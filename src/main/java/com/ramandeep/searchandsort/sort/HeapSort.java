package com.ramandeep.searchandsort.sort;

import com.ramandeep.searchandsort.util.ArrayModifier;
import com.ramandeep.searchandsort.util.Heap;
import com.ramandeep.searchandsort.util.MaxHeap;

public class HeapSort implements Sort {

	@Override
	public void sort(int[] array) {
		Heap heap = new MaxHeap(array);
		for (int i = array.length - 1; i > 0; i--) {
			ArrayModifier.swapElements(heap.getHeap(), i, 0);
			heap.setHeapSize(heap.getHeapSize() - 1);
			heap.heapify(0);
		}
	}

}
