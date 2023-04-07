import java.util.Arrays;

public class 2DTraversal {
	public static void main(String[] args) {

		double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, 
    {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, 
    {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		

		double runnerTime = 0.0;
		for(int outer = 0; outer < times.length; outer++) {
      System.out.println("Runner #" + outer);
      System.out.println("Times: " + Arrays.toString(times[outer]));
			runnerTime = 0.0;
      
			for(int inner = 0; inner < times[outer].length; inner++) {
				runnerTime+=times[outer][inner];
			}

      double averageVal = 0;
      int innerNum = times[outer].length;
      averageVal = runnerTime/innerNum;

			System.out.println("Average: " + averageVal);
      System.out.println();
		}
	}
}
