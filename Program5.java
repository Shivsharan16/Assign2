package com.cdac;

public class Program5 {

	public static void main(String[] args) {
		int num[] = new int[] { 10, 28, 07, 78, 94, 64, 55 };

		int smallest = num[0];
		int largest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest)
				largest = num[i];
			else if (num[i] < smallest)
				smallest = num[i];

		}
System.out.println("Largest number= "+largest);
System.out.println("Smallest number= "+smallest);

	}

}
