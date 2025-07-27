import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largestelement {  // time complexity : O(n)
    public static void large(List<Integer> arr, int size) {
        int currentLarge = 0;
        for (int i = 1; i < size; i++) {
            if (arr.get(i) > arr.get(currentLarge)) {
                currentLarge = i;
            }
        }
        int largest = arr.get(currentLarge);
        System.out.println("Largest element is: " + largest);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 8, 5, 6, 9));
        int size = arr.size();
        large(arr, size);
    }
}

