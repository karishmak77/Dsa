//Question : Remove Duplicates from an Array [ level: easy ]

// import java.util.List;
// import java.util.Scanner;
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.LinkedHashSet;


public class removeDuplicate {   
   
    public static int removedum(int arr[]) {  // Two pointers Methods
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Number of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 3};
        Arrays.sort(arr); // You MUST sort the array first
        int k = removedum(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }


  // public static void main(String[] args) {   
  //     List<Integer> arr= new ArrayList<>(); // Time complexity:O(n)   using only methods
  //     Scanner sc= new Scanner(System.in);

  //   System.out.print("Enter the Size of an array: ");
  //   int size=sc.nextInt();

  //   System.out.print("Enter the Elements in the Array: ");
  //   for(int i=0;i<size;i++){
  //     int input=sc.nextInt();
  //     arr.add(input);
  //   }
  //   System.out.println("Before removing Duplicate array: "+ arr);

  //   // This method will remove the Duplicate elements 
  //   LinkedHashSet<Integer> unique= new LinkedHashSet<>(arr);
  //   unique.addAll(arr);
  //   System.out.println("After removing Duplicate array: "+ unique);

  //   sc.close();

  // }  
 
}



//code:-1
// The input array must be sorted first so that duplicates come next to each other.
// That's why you use Arrays.sort(arr) before calling the function.
// I use two pointers:
// i keeps track of the last unique element’s position
// j scans through the array
// If arr[i] != arr[j], it means we’ve found a new unique element.
// So, we increment i and store arr[j] at arr[i] to move the unique element forward
// In the end, the first i + 1 elements of the array contain all the unique elements in order.

// Time Complexity:
// Sorting: O(n log n)
// Removing duplicates: O(n)
// Total: O(n log n)
// Space Complexity:
// O(1) → In-place operation, no extra data structures used



//code:-2
// LinkedHashSet is used here because:
// It doesn’t allow duplicates
// It preserves the insertion order (unlike HashSet)
// You collect input using Scanner, store it in an ArrayList, then pass it to the LinkedHashSet to filter out duplicates.
// The result is a list of unique elements in the same order they were originally entered.

// Time Complexity:
// Input: O(n)
// Set conversion: O(n)
// Total: O(n)
// 💾 Space Complexity:
// O(n) → because LinkedHashSet uses extra memory to store elements
