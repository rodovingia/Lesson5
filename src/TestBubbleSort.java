/**
 * Created by ronald on 13-3-2016.
 */
public class TestBubbleSort {

    public static void main(String args[]) {
        BubbleSort b = new BubbleSort();

        System.out.println("Unsorted array:");
        b.print();

        b.bubbleSorting();
        System.out.println("Sorted array:");
        b.print();

    }
}
