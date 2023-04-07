import java.util.Arrays;

public class Create2DArrayWithConditionals {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
							         {255,10,5,255,10,5,255,255},
							         {255,255,255,0,255,255,255,75},
							         {255,60,30,0,30,60,255,255}};
		
		//newImage is a cropped image without the last two columns of imageData
		int[][] newImage;
    newImage = new int[4][6];

    int newRow = 0;
    int newColumn = 0;
    for(int i=0; i < imageData.length; i++){
      newColumn = 0;
      for(int j=0; j < imageData[i].length; j++){
        if(j<6){
          newImage[newRow][newColumn] = imageData[i][j];
          newColumn++;
        }
      }
      newRow++;
    }

		System.out.println(Arrays.deepToString(newImage));
    System.out.println();
	
		//Decrease pixel brightness by 50
		for(int i = 0; i<newImage.length; i++){
      for(int j = 0; j<newImage[i].length; j++){
        newImage[i][j]-=50;
        if(newImage[i][j] < 0){
          newImage[i][j] = 0;
        }
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}
