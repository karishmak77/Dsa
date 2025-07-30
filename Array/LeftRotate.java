// Question : Left Rotate the Array by One [level: easy]
public class LeftRotate {
  public static void InnerLeftRotate(int arr[]) {
    if (arr.length==0) {
      System.out.println("array is empty");
      return;
    }

    int first= arr[0];
    for(int i=0;i<arr.length-1;i++){
      arr[i]=arr[i+1];
    }

    arr[arr.length-1] =first;

    System.out.println("after Left Rotation by One: ");
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
  
    
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    System.out.println("Current arrray");
     for(int j=0;j<arr.length;j++){
      System.out.println(arr[j]+" ");
    }

    InnerLeftRotate(arr);


  }

  
}




// Language: Java
// Technique:
// Store the first element
// Shift all elements one position to the left
// Place the stored first element at the end

// Time Complexity: O(n)
// Space Complexity: O(1) → In-place rotation
