package com.ramandeep.searchandsort.util;

public class UnsortedArrayProvider {
	public static int[] getArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		shuffle(array);
		return array;
	}

	private static void shuffle(int[] array) {
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
			// Get a random index of the array past i.
			int random = i + (int) (Math.random() * (n - i));
			// Swap the random element with the present element.
			int randomElement = array[random];
			array[random] = array[i];
			array[i] = randomElement;
		}
	}
}
