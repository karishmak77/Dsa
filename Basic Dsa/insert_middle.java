public class insert_middle {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 6, 7};
        int length = arr.length;
        int arr1[] = new int[length + 1];
        int mid = length / 2;

      
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }

       
        arr1[mid] = 4;

        
        for (int j = mid; j < length; j++) {
            arr1[j + 1] = arr[j];
        }

        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}

  

//Insert an element at the middle of the array