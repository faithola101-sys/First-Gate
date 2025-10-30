public class Square {
    public static void main(String[] args) {

    int num = 2;

    boolean isSquare = false;
    

    int[] lists = {4,9,25,49};
    
   
    for (int i = 0; i < lists.length; i++) { 
    int result = lists[i];
     
    num = result / num;
    isSquare = false;
     
    if (num * num >= result) 
    isSquare = true; 
    
    num++;
    System.out.println(result + "." + isSquare); 
   
  }    
 }
}

    

    

    