package mergesort;

/**
 * Testing the MergeSort algorithm implementation on a set of integers
 *
 * @author Joshua Kissoon
 * @since 20140301
 */
public class MergeSortIntegerTest
{

    public static void main(String[] args)
    {
        /* Using Merge sort with a set of Integers */
        Integer[] items =
        {
            8, 10, 13, 5, 14, 11, 7, 12, 1, 4, 17, 20, 18, 6, 9, 15, 19, 2, 16
        };

        MergeSort<Integer> mergeSort = new MergeSort<>(items);
        mergeSort.sort();
        System.out.println("Printing Sorted Items: ");
        for (Integer x : mergeSort.getSortedItems())
        {
            System.out.print(x + " ");
        }
    }
}
