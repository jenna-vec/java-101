import java.util.HashMap;
import java.util.Arrays;

public class TwoSumPrintVersion {

  public static void main(String[] args) {
      int[] array = {2,7,11,15};
      int target = 9;

      int[] result = new int[2];
      HashMap <Integer, Integer> chart = new HashMap<>();

      for(int i=0; i<array.length; i++){
        if(chart.containsKey(target - array[i])){
          result[0] = chart.get(target - array[i]);
          result[1] = i;
          break;
        }
        chart.put(array[i], i);
      }

      System.out.println("Resulting hash map: " + chart);

      if(result[0] == 0 && result[1] == 0){
        System.out.println("Solution not found.");
      }
      else{
        System.out.println("Solution: " + Arrays.toString(result)); 
      }
  }

}
