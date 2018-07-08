package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] list = new String[5];
		//2. print the third element in the array
			System.out.println(list[2]);
		//3. set the third element to a different value
			list[2]="third";
		//4. print the third element again
			System.out.println(list[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for (int i = 0; i < list.length; i++) {
			list[i]="Number: "+(i+1);
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		//7. make an array of 50 integers
			Integer[] intArray = new Integer[50];
		//8. use a for loop to make every value of the integer array a random number
			Random randy = new Random();
			
			for (int i = 0; i < intArray.length; i++) {
				int x = randy.nextInt(50);
				intArray[i]=x;
			}
		//9. without printing the entire array, print only the smallest number on the array
			int x = intArray[0];
			for (int i = 0; i < intArray.length; i++) {
				if(intArray[i]<x) {
					x=intArray[i];
				}
			}
			System.out.println(x);
		//10 print the entire array to see if step 8 was correct
			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}
		//11. print the largest number in the array.
		int y = 0;
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]>y) {
				y=intArray[i];
			}
		} 
		System.out.println(y);
		//12. print only the last element in the array
		System.out.println(intArray.length-1);
	}
}
