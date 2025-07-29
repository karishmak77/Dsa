// Quetion : Find Missing Values Between Consecutive Elements in a Sorted Array   [ level : easy ]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missVaule {
  public static void missingVaule(List<Integer> arr){  //Time complexity : O(m+n)
    List<Integer> missing = values(arr);
        System.out.println("Missing values: " + missing);
    }

    public static List<Integer> values(List<Integer> arr) {
        List<Integer> missValue = new ArrayList<>();
        
        for (int i = 0; i < arr.size() - 1; i++) {
            int current = arr.get(i);
            int next = arr.get(i + 1);
            for (int num = current + 1; num < next; num++) {
                missValue.add(num); // Add all numbers between current and next
            }
        }
        return missValue;

  }
  public static void main(String[] args) {
    List<Integer> arr= new ArrayList<>(Arrays.asList(1,2,4,5));
    missingVaule(arr);
  

 }
  
}




// ➤ missingVaule(arr)
// This is the main function that receives the input list and prints the result.
// It calls the helper function values(arr) to get the missing numbers.
// ➤ values(arr)
// Iterates through the list, comparing each element (current) with the next (next).
// For each pair, it checks if there are numbers between them:
// Example: if current = 2, next = 5 → it adds 3, 4 to the result.
// All missing numbers between each consecutive pair are added to a new list missValue.


// Time and Space Complexity:
// Time Complexity: O(m + n)
// n = number of elements in the list
// m = number of missing values between elements
// Because we traverse both original and missing values (depending on the range), total time is proportional to both
// Space Complexity: O(m)
// A new list missValue is used to store the missing numbers

