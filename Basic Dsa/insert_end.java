//Insert an element at the First end

import java.util.Scanner;
class insert_end {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to put at the first index: ");
        int firstElement = sc.nextInt();

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = firstElement;
        size++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sc.close();


    

  }
  
}
