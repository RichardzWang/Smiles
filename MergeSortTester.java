// Team Smiles - Richard Wang, David Merlinsky, Ling Cheng
// APCS2 - pd5
// HW11 -- Wrapping It Up
// 2016-03-10


/*======================================
  class MergeSortTester
  ALGORITHM:
  
  Merge Sort is inherently a recursive function.  Its main role is to split the array and merge them.  Within each recursive call, the sort method calls for a merge of the split arrays.  However, the cascading merge calls (which does the comparison through the first element of the subarrays) will not go into effect until all of the arrays reach a length of 1.  Then, the merges will be called on each of the subarrays until the sort is done.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  
  The algorithm has a runtime classfication of O(nlogn).

  Mean execution times for dataset of size n:
  Batch size: 9 for 1 - 100, 27 for 100 - 49900 (Multiples of 9 since the first run is always an outlier)
  n=1       time: 1188.111111 nanoseconds
  n=10      time: 9930.666667 nanoseconds
  n=100     time: 25231.66667 nanoseconds
  ...
  n=49900  time: 11362057.13 nanoseconds
  ANALYSIS:
  
  link for collaborative google spread sheet with graphs:
  https://docs.google.com/spreadsheets/d/1ousd3TCz_ZjdxYjkYtChDjkSSZD7s2szYc2olSqBwlY/edit#gid=1090030690

  We took a a batch test of 9 for the ranges 1 to 100 and 100 to 49900 (the second range goes up by increments of 100).  After taking the average and graphing the second.  The FINAL sheet of the google sheets represents the average of all of our runtimes, which has a general shape of O(nlogn).  However, like BinVLin, the run-times drop at certain locations.  We also included individual run-time sheets, in which the calculation of nlog(n) seems to create the correct ratios for most of the time (again, there are certain points where the run-time drops due to memory).  

  Nevertheless, by taking the ratio of our data along with the ratio of nlogn at certain points, we have concluded that mergeSort has a O(nlogn) classification.
  

  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    
    
    public static int[] createArray(int n) {
	int[] test = new int[n];
	for (int i = 0; i < n; i++) {
	    test[i] = (int)(Math.random() * n);
	}
	return test;
    }


    public static void main( String[] args ) 
    {
	long startTime, endTime, totalTime;

	/*
	for (int c = 1; c < 101 ; c++) { // 1 - 100 - not included in the spreadsheet graph for clarity
	    
	    for  (int i = 0; i < 10; i++){  


		int[] arr = createArray(c);
		startTime = System.nanoTime();
		MergeSort.sort(arr);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if (i < 9){
		    System.out.print(totalTime + ",");
		}
		else {
		    System.out.print(totalTime + "\n");
		}
	    }
	}
	*/

	
	for (int c = 100; c < 50000 ; c+= 100) { //5 * 10^4
	    
	    for  (int i = 1; i < 10; i++){  


		int[] arr = createArray(c);
		startTime = System.nanoTime();
		MergeSort.sort(arr);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if (i < 9){
		    System.out.print(totalTime + ",");
		}
		else {
		    System.out.print(totalTime + "\n");
		}
	    }
	}
	

    }//end main

}//end class
