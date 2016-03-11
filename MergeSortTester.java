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

	for (int c = 100; c < 1000; c++) {
	    
	    for (int i = 1; i < 100000000 ; i*= 2) { // 10 to the 8 {


		int[] arr = createArray(c);
		startTime = System.nanoTime();
		MergeSort.sort(arr);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if (i < 999){
		    System.out.print(totalTime + ",");
		}
		else {
		    System.out.print(totalTime + "\n");
		}
	    }
	}

    }//end main

}//end class