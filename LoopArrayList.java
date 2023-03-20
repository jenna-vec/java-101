import java.util.ArrayList;
import java.util.Collections;

class LoopArrayList {

	public static void main(String[] args) {
    ArrayList<Integer> myInts = new ArrayList<Integer>();
    myInts.add(5);
    myInts.add(3);
    myInts.add(4);
    myInts.add(3);
    myInts.add(2);
    Collections.sort(myInts);
    for (int i = 0; i < myInts.size(); i++) {
  		if(myInts.get(i)%2 !=0){
        myInts.remove(myInts.get(i));
        i--;
      }
	  }
    System.out.println(myInts);
    //[2,4]
  }

}
