package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
		public static void main(String[] args) {
			String[] test = new String[10];
			for (int i = 0; i < test.length; i++) {
				test[i]= "Num."+i;
			}
//			for (int i = 0; i < test.length; i++) {
//				System.out.println(test[i]);
//			}
			//printStrings(test);
			//printStringsBackwards(test);
			//printOtherString(test);
			printRandomString(test);
		}
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
		void printStrings(String[] x) {
			
			for (int i = 0; i < x.length; i++) {
				System.out.println(x[i]);
			}
		}
	
	
	static //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printStringsBackwards(String[] x) {
		
		for (int i = x.length-1; i > -1; i--) {
			System.out.println(x[i]);
		}
		
	}
	
	
	static //4. Write a method that takes an array of Strings and prints every other String in the array.
		void printOtherString(String[] x) {
			
			for (int i = 0; i < x.length; i+=2) {
				System.out.println(x[i]);
			}
			
		}
	
	static //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
		void printRandomString(String[] x) {
		
			Random randy = new Random();
			String[] newArray = new String[x.length];
			int wordsPrinted = 0;
			
			
			
		while(wordsPrinted < x.length) {
				int y = randy.nextInt(x.length);
				boolean bool = false;
				for (int i = 0; i < wordsPrinted; i++) {
					if(newArray[i].equals(x[i])) {
						bool = true;
						break;
					}
				}
				if(!bool) {
					System.out.println(x[y]);
					newArray[wordsPrinted] = x[y];
					wordsPrinted++;
				}
				
				
			}
			
		}
	
}
