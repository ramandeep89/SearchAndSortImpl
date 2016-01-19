package com.ramandeep.searchandsort.util;

public class MinHeap extends Heap {

	public MinHeap(int[] heap) {
		super(heap);
	}

	@Override
	public void heapify(int node) {
		int l = left(node);
		int r = right(node);
		int smallest = node;
		if (l < heap.length && heap[l] < heap[node])
			smallest = l;
		if (r < heap.length && heap[r] < heap[smallest])
			smallest = r;
		if (smallest != node) {
			ArrayModifier.swapElements(heap, node, smallest);
			heapify(smallest);
		}
	}

}
