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
    
  

  // public static void removeDup(List<Integer> arr, int size){  // the time complexity : O(n)2 square
  //   int i=0;
  //   while (i<arr.size()) {
  //     int j=i+1;
  //     while (j<arr.size()) {
  //       if (arr.get(i).equals(arr.get(j))) {
  //         arr.remove(j);
          
  //       }else{
  //         j++;
  //       }
  //     }
  //     i++;
      
  //   }
  // }
  // public static void main(String[] args) {
  //   List<Integer> arr= new ArrayList<>();
  //   Scanner sc= new Scanner(System.in);

  //   System.out.print("Enter the Size of an array: ");
  //   int size=sc.nextInt();

  //   System.out.print("Enter the Elements in the Array: ");
  //   for(int i=0;i<size;i++){
  //     int input=sc.nextInt();
  //     arr.add(input);
  //   }
  //   removeDup(arr, size);
  //   System.out.println(arr);
  

  //   sc.close();

  // }
}
