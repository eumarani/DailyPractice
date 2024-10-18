import java.util.Arrays;
import java.util.List;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr ={1, 3, 2, 6, 8, 7, 4};
      /* int[] sortedarray= Arrays.stream(arr).boxed()
               .sorted((a,b)->b-a)
                       .mapToInt(Integer::intValue)
               .toArray();
       System.out.println(Arrays.toString(sortedarray));*/

      int max= Arrays.stream(arr).max().orElseThrow();
      System.out.println(max);
      int expectedSum=max*(max+1)/2;
      System.out.println(expectedSum);
      int actualSum=Arrays.stream(arr).sum();
      System.out.println(actualSum);
      int missingNum=expectedSum-actualSum;
      System.out.println(missingNum);


    }
}