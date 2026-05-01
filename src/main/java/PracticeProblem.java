/*
File: Lesson 5.2 - Arrays, Searching, Copying, Deleting
Author: Stephen Li
Date Created: May 1, 2026
Date Last Modified: May 1, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int findValue(int num1, int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == num1) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String word1, String[] array1) {
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (word1.equals(array1[i])) {
				count++;
			}
			if (count == 3) {
				return i;
			}
		}
		return -1;
	}

	public static double[] append(double double1, double[] array1) {
		double[] array2 = new double[array1.length + 1];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		array2[array1.length] = double1;
		return array2;
	}
}
