package jesus.week3;

public class Week3Assignments {

	public static void main(String[] args) {

		//Part 1.	
		int ages[] = { 9, 23, 64, 2, 8, 28, 93 }; // creation of age array

		int lastElementIndex = ages.length;
		System.out.println("The last element of the array, minus the first element equals: " + (ages[lastElementIndex - 1] - ages[0])); // Part a 
		
		double sum = 0;
		for (int numbers : ages) {
			sum += numbers;
		}
		System.out.println("The avarage of the array is: " + String.format("%.2f", (sum / lastElementIndex))); // Part c
		
		// System.out.println(ages[ages.length -1]); return the last element of the array 
//	Part 2. a

		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; 
		int index = 0;
		
		for(String letters: names) {
			index += letters.length();
			
		}
		
		
		System.out.println("The avarage number of letters in the array is: " + index/names.length);
		
		
		//Part b, Concatenate elements of the array 
		
		String sum2 = ""; 
		
		for (String name: names) {
			sum2 += (name +" ");
		}
		System.out.println(sum2);
		
		

	}

}
