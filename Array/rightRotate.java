// Question : Right Rotate the Array by One [level: easy]

public class rightRotate {
  public static void rotateRight(int nums[]){
   int last= nums[nums.length-1];
   for(int i= nums.length-1; i>0;i--){
    nums[i]=nums[i-1];
   }
   nums[0]=last;
  }
  public static void main(String[] args) {
    int nums[]= {1,2,3,4,5};
    rotateRight(nums);

    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }

  }
  
}


//Language: Java
// Technique:
// Store the last element
// Shift all elements one position to the right
// Place the stored last element at the start

// Time Complexity: O(n)
// Space Complexity: O(1) → In-place rotation
