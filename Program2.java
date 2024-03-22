package com.pacakge;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,20,30,60,50}; 

		boolean isEqual =Arrays.equals(arr1, arr2);
		if(isEqual) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are not Equal");
		}
	}

}
