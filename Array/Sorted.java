
// check the array if it is sorted or not

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














  // public static void SortedOrNot(List<Integer> arr, int size){ // Tiem complexity is Average here: O(n)
  //   int current=0;
  //   for(int i=1;i<size;i++){
    
  //     if (arr.get(current)>arr.get(i)) {
  //       System.out.println("the array is not sorted");
  //      return;
        
  //     }
  //       current++;
  //     }
  //     System.out.println(" the array is sorted");
  
  //   }
  

  // public static void main(String[] args) {
  //   List<Integer> arr= new ArrayList<>();
  //   Scanner sc= new Scanner(System.in);
    
  //   System.out.print("Enter the size of an array: ");
  //   int size=sc.nextInt();

  //   System.out.print("Enter the Elements: ");
  //   for(int i=0;i<size;i++){
  //     int input=sc.nextInt();
  //     arr.add(input);
  //   }
  //   SortedOrNot(arr, size);
  //   sc.close();
    

  // }
  
}
