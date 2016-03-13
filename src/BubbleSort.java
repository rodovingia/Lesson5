/**
 * Created by ronald on 13-3-2016.
 */

/**
 * @author (Ronald)
 * @version (2)
 */

public class BubbleSort {
    // instance variables
    private int [] nums;

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort() {
        int g = 5; // generator
        int n = 1;
        int p = 7; // prime number; p should be greater than g
        nums = new int [p];

        // generate unsorted array (in a tricky way)
        for(int i = 0; i< nums.length-1; i++) {
            n = n*g % p;
            nums[i]= n;
        }
        nums[nums.length-1]= 0;
    }

    public void print() {
        for(int item: nums){
            System.out.println(item);
        }
    }

    public void bubbleSorting() {
        for(int a=1; a< nums.length; a++) {
            for( int b=nums.length-1; b>= a; b-- ) {
                if( nums[ b-1 ] > nums[ b ] ) {
                    // swap numbers
                    int temp = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = temp;
                }
            }
        }
    }
}
