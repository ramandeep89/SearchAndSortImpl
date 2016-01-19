package com.ramandeep.searchandsort.util;

public abstract class Heap {
	protected final int[] heap;
	protected int heapSize;

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

	public Heap(int[] heap) {
		super();
		this.heap = heap;
		this.heapSize = heap.length;
		buildHeap();
	}

	public int parent(int node) {
		return node / 2 - 1;
	}

	public int left(int node) {
		return 2 * node + 1;
	}

	public int right(int node) {
		return 2 * node + 2;
	}

	public int[] getHeap() {
		return heap;
	}

	public abstract void heapify(int node);

	public void buildHeap() {
		for (int i = (int) Math.ceil((double) heap.length / 2); i >= 0; i--) {
			heapify(i);
		}
	}
}
