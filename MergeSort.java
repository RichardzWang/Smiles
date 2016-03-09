// Richard Wang
// APCS2 pd5
// HW09 -- Mergers and Acquisitions
// 2015-03-06

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  The sort method first separates the array in half (or as close to half as possible).  The second pile will always have 1 more or exactly the same number of elements.  Until the second pile/array reaches 1 element, sort will continue to call merge on the sorting of two halves of the array.  When the second pile/array has 1 element, the base case will be called, merging the two arrays. Then the merges will all be called until the entire array is sorted. 
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] retArr = new int[a.length + b.length];
	int c1 = 0;
	int c2 = 0;
	while ( c1 < a.length && c2 < b.length ) {
	    if (a[c1] < b[c2]) {
		retArr[c1+c2] = a[c1];
		c1++;
	    }
	    else {
		retArr[c1+c2] = b[c2];
		c2++;
	    }
	}

	for (; c1 < a.length; c1++) {
	    retArr[c1+c2] = a[c1];
	}


	for (; c2 < b.length; c2++) {
	    retArr[c1+c2] = b[c2];
	}
	return retArr;

        
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	int[] arr1 = new int[arr.length/2];
	for (int i = 0; i < arr1.length; i++) {
	    arr1[i] = arr[i];
	}
	int[] arr2 = new int[arr.length - (arr.length/2)];
	for (int i = 0; i < arr2.length; i++) {
	    arr2[i] = arr[arr1.length+i];
	}
	if (arr2.length <= 1) {
	    return merge( arr1, arr2 );
	}
	else {
	    return merge(sort(arr1),sort(arr2));
	}
	
    }//end sort()
    


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
