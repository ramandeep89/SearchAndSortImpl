package com.ramandeep.searchandsort.util;

public class ArrayModifier {

	/**
	 * 
	 * @param array
	 * @param x:
	 *            rotate starts from
	 * @param y:
	 *            rotate ends at (this element will move to front)
	 */
	public static void rotateRight(int[] array, int x, int y) {
		int temp = array[y];
		for (int i = y - 1; i >= x; i--) {
			array[i + 1] = array[i];
		}
		array[x] = temp;
	}
	
	/**
	 * 
	 * @param array
	 * @param x:
	 * @param y:
	 */
	public static void swapElements(int[] array, int x, int y) {
		int temp = array[y];
		array[y] = array[x];
		array[x] = temp;
	}
}
