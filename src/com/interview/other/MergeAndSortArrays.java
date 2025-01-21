package com.interview.other;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeAndSortArrays {
	
	public static void main(String[] args) {
		
		
		int[] arr1 = {1,4,6};
		int[] arr2 = {2,7,3};
		
		int[] array3 = Stream.concat(
				Arrays.stream(arr1).boxed(), 
				Arrays.stream(arr2).boxed()
				).distinct().sorted().mapToInt(Integer::intValue).toArray();
		
		System.out.println("concat : "+Arrays.toString(array3));
	}

}

//Explanation:
//Convert Arrays to Streams: Use Arrays.stream(array) to create streams for array1 and array2.
//Merge Streams: Use Stream.concat() to merge the two streams.
//Sort the Stream: Apply the sorted() method to sort the elements.
//Convert Stream Back to Array: Use mapToInt(Integer::intValue) to convert the stream of Integer back to int and then collect it into an array with .toArray().
//Print the Result: Convert the sorted array to a string with Arrays.toString() for display.