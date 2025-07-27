
// Questions: Check the array if it is sorted or not ( Acending order )

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorted {
  public static void SortedOrNot(List<Integer> arr, int size){
    for(int i=1; i<size; i++){
      if (arr.get(i)<arr.get(i-1)) {
        System.out.println("Array is not sorted"); 
        return;
      }
    }
    System.out.println("Array is sorted");
  }
  public static void main(String[] args) {
      List<Integer> arr= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter the size of an array: ");
    int size=sc.nextInt();

    System.out.print("Enter the Elements: ");
    for(int i=0;i<size;i++){
      int input=sc.nextInt();
      arr.add(input);
    }
    SortedOrNot(arr, size);
    sc.close();
    
    
  }
  
}

// Language Used: Java
// Concept: Array traversal and pairwise comparison
// Technique:
//--> Start from the second element (index 1)
//--> Compare each element with the previous one (arr[i] < arr[i - 1])
//--> If any element is smaller than the previous, the array is not sorted
//--> If loop completes, the array is sorted

// Time Complexity: O(n) – We check each element once
// Space Complexity: O(1) – No extra space used


