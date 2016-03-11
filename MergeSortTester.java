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

	for (int c = 100; c < 100000 ; c+= 100) { //10^6
	    
	    for  (int i = 1; i < 20; i++){  


		int[] arr = createArray(c);
		startTime = System.nanoTime();
		MergeSort.sort(arr);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if (i < 19){
		    System.out.print(totalTime + ",");
		}
		else {
		    System.out.print(totalTime + "\n");
		}
	    }
	}

    }//end main

}//end class
