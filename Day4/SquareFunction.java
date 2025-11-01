public class Square {

      public static void main(String[] args)     {
      int[] lists = {4,9,7,49,100};
      
      for (int i = 0; i < lists.length; i++) {
      int number = lists[i];
      boolean result = square(lists[i]);
      System.out.println(lists[i] + "." + result);
    } 
 }
    public static boolean square(int number) {
    boolean isSquare = false;

    for(int num = 2; num * num <= number; num++)  {
    
    if (num * num == number)
    isSquare = true; 
    
    else
    isSquare = false;
    
   }
    return isSquare;
       
 }
}