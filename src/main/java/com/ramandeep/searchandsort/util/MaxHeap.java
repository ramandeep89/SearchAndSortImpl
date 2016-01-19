package com.ramandeep.searchandsort.util;

public class MaxHeap extends Heap {

	public MaxHeap(int[] heap) {
		super(heap);
	}

	@Override
	public void heapify(int node) {
		int l = left(node);
		int r = right(node);
		int largest = node;
		if (l < heapSize && heap[l] > heap[node])
			largest = l;
		if (r < heapSize && heap[r] > heap[largest])
			largest = r;
		if (largest != node) {
			ArrayModifier.swapElements(heap, node, largest);
			heapify(largest);
		}
	}

}
