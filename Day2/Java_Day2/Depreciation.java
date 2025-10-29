public class Depreciation {
       public static int item(int item){
     
     int item = 1;
     int fp = 50000;
     int dpy = 0.08;
     int years = 0;

     for(int fp = 50000; fp > years; fp = fp * 1) {
     
     item = item * fp;
     fp = fp * 0.08; 
     System.out.print(fp);

     if(fp == 0)break;
     
     return item;
     

   }
}

public static void main(String[] args) {
int result = item(2);
System.out.print(result);


}
}