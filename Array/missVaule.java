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
