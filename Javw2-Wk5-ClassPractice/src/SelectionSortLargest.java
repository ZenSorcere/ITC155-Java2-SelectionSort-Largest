//**********************************************************************
// Selection Sort:modified - Searching and Sorting - Ch13, Ex18, p890
//  
// Write a modified version of the selection sort algorithm that selects
//   the largest element each time and moves it to the end of the array,
//   rather than selecting the smallest element and moving it to the
//   beginning.
// Will this algorithm be faster than the standard selection sort? What
//   will its complexity class be?
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// ANSWER #18:
//   Based on the modifications to the algorithm, no additional if
//     statements or for loops were needed. Since just the direction
//     of the iteration was changed, I think the speed of this version
//     would be identical.
//   It's complexity class is O(N^2) as there is a nested for loop,
//     which goes through the entire N value of the provided array each
//     loop.  
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
// By: Michael Gilson
// Date: 5/15/2020
//**********************************************************************
//**********************************************************************
// Program Complexity - Searching and Sorting - Ch13, Ex 4 & 5, p888
//  
// To which complexity class does the provided algorithm belong?
//   Consider N to be the length or size of the array or collection
//   passed to the method. Explain your reasoning.
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// ANSWER #4:
//   I classified this as O(N). There is a for loop that does iterate
//     across the entire array, which gives us N. Also, there is an
//     initializing of an array, also (having researched it online) is
//     a O(N). The steps in the for loop are just assignments with some
//     math function, which leaves us looking at 2N. This equates to O(N).
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// ANSWER #5:
//   I classified this as O(N). We have a for loop with an iterator (i++)
//     which indicates traversal of the array. This would be N.  However,
//     it isn't doing the entire array, just list.length/2, making it 
//     1/2N. the statement in the for loop are swapping assignments,
//     which leaves us with 1/2N.  This equates to O(N).   
//**********************************************************************

// Needed import for displaying array contents
import java.util.Arrays;

public class SelectionSortLargest {

	public static void main(String[] args) {
		
// Set up test array with easily identifiable order values
		int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
// Print out unsorted array.
		System.out.println("Original array" + Arrays.toString(numbers));
		
// Run modified SelectionSort on test array
		selectionSortL(numbers);
		
// Print out sorted array after modified selectionSort method.
		System.out.println("Sorted array:" + Arrays.toString(numbers));
		
	} //end main

// Carried over swap method from original SelectionSort:
//   Swaps a[i] with a[j].
    public static void swap(int[] a, int i, int j) {
        if (i != j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        } //end if
    } //end swap method
      
// For loop to go through given array, starting at the last index, and goes
//   from end to the beginning. Each time through the outer loop will have "i"
//   be declared as largest, and the inner for loop will also iterate from the
//   end to the beginning of the array, starting with an index one less than
//   the outer for loop position.

// If statement checks if the inner for loop's current index is larger than "largest".
//   If so, sets largest to that index. 
    public static void selectionSortL(int[] a) {
        for (int i = a.length -1; i >= 0; i--) {
            int largest = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[largest]) {
                    largest = j;
                } //end if 
            } //end outer for loop
            
// Outer for loop will then run the swap method to swap the i index with current
//   index of largest.
            swap(a, i, largest);
            
// Print out the Arrays.toString method for the given array at the end of each
//   outer for loop completion to track progress of swapping.
            System.out.println("Where i = " + i + ": " + Arrays.toString(a));
            
        } // end outer for loop
    } // end selectionSortL method
	
	
	
} //end class
