// Question: Reverse the given array 

public class reversingArray {
  public static void rev(int []arr, int size){  // Time Complexity: O(n) Space Complexity: O(1)
    int i=0;
    for(int j=size-1;j>size/2;j--){
      int temp= arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
    }

    System.out.println(" Reverse Array: ");
    for(int k=0; k<arr.length;k++){
      System.out.print(arr[k]+",");
    }
    
  }
  public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,6};
    int size= arr.length;
    System.out.println(" Before Reverse Array: ");
     for(int k=0; k<arr.length;k++){
      System.out.print(arr[k]+",");
    }
      
    rev(arr, size);


}
}
