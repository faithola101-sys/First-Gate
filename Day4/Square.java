import java.util.Arrays;
public class Square {
    public static void main(String[] args) {

    boolean isSquare = false;

    int[] lists = {4,9,7,49,100};

    boolean[] results = new boolean[4];
    

    for (int i = 0; i < lists.length; i++)     {
    
    int number = lists[i];

    for(int num = 2; num * num <= number; num++)  {
    
    if (num * num == number)
    isSquare = true; 
    
    else {
    isSquare = false; 
   }

    results[i] = isSquare;
   }

    System.out.println(Arrays.toString(results)); 
  }  
 }
}

    

    

    