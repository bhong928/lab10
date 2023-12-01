import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        int[] arr = {5, 9, 7, 10, 2};
        int[] Sortedarr = {2, 7, 8, 9, 10};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    public void testNegative() {
        int[] arr = {-6, -1, -4, -5, -2};
        int[] Sortedarr = {-5, -4, -3, -2, -1};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    public void testMixed() {
        int[] arr = {-4, 3, 0, -1, 5};
        int[] Sortedarr = {-2, -1, 0, 3, 5};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }

    public void testDuplicates() {
        int[] arr = {3, 3, 2, -1, -1};
        int[] Sortedarr = {-1, -1, 2, 2, 3};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(Sortedarr, sorter.basicSelectionSort(arr));
    }
}
