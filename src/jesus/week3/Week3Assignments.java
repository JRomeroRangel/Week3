package jesus.week3;

import java.util.Arrays;

import javax.naming.event.NamespaceChangeListener;

public class Week3Assignments {

	public static void main(String[] args) {

// Part 1.
		int ages[] = { 9, 23, 64, 2, 8, 28, 93 }; // creation of age array

		int lastElementIndex = ages.length;
		System.out.println("The last element of the array, minus the first element equals: "
				+ (ages[lastElementIndex - 1] - ages[0])); // Part a

		double sum = 0;
		for (int numbers : ages) {
			sum += numbers;
		}
		System.out.println("The avarage of the array is: " + String.format("%.2f", (sum / lastElementIndex))); // Part c

//	Part 2. a

		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int index = 0;

		for (String letters : names) {
			index += letters.length();

		}

		System.out.println("The avarage number of letters in the array is: " + index / names.length);

// Part b, Concatenate elements of the array

		String sum2 = "";

		for (String name : names) {
			sum2 += (name + " ");
		}
		System.out.println(sum2);

//Part 5
		int nameLengths[] = new int[names.length];
		int j = 0;
		int k = 0;
		for (String letters : names) {
			j = letters.length();
			nameLengths[k] = j;
			k++;
		}

		System.out.println(Arrays.toString(nameLengths));

//Part 6 
		int sum5 = 0;

		for (int count : nameLengths) {
			sum5 += count;

		}
		System.out.println("Sum of all the elements in the array is: " + sum5);

//Part 7 Method Return		
		System.out.println(myword("Hello", 3));

//Part 8 Method Return
		System.out.println(myName("Jeus", "Romero"));

// Part 9 Method Return 
		int testArray[] = { 50, 50 };
		System.out.println(myArray(testArray));
//Part 10
		double doubleArray[] = { 10.00, 15.5, 20.5 };
		System.out.println(String.format("%.2f", myDouble(doubleArray)));

//Part 11 Method Return
		double avgArray[] = { 50.00, 50.00 };
		System.out.println(avg(avgArray, doubleArray));

//Part 12 Method return 
		System.out.println(willBuyDrink(true, 10.51));

//Part 13 Method
		findEvenOdd(256);

	}

//---------------------------------------------------------Main Method Break_____________________________________________________________	
// Part 7
	public static String myword(String word, int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			answer += word;
		}

		return answer;
	}

//Part 8
	public static String myName(String name1, String name2) {

		String answer = name1 + " " + name2;

		return answer;
	}

//Part 9 
	public static boolean myArray(int[] num) {

		int sum = 0;
		for (int numbers : num) {

			sum += numbers;

		}

		if (sum >= 100) {

			return true;
		} else
			return false;

	}

//Part 10

	public static double myDouble(double[] num) {

		double sum = 0;
		for (double numbers : num) {

			sum += numbers;

		}
		return sum / num.length;
	}

//Part 11	
	public static boolean avg(double[] x, double[] y) {
		if (myDouble(x) > myDouble(y)) {
			return true;
		} else
			return false;

	}

//Part 12
	public static boolean willBuyDrink(boolean isHotOUtside, double moneyInPocket) {

		if (isHotOUtside && moneyInPocket > 10.50)
			return true;
		else
			return false;
	}

//Part 13
	public static void findEvenOdd(int num) // is an integer odd or even.
	{
		// method body
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}

}
