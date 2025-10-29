public class Reverse {
public static void main(String[] args) {

char ch = 0;
String days = "dcbaefd";

for(int i = 6; i < days.length(); i = i - 1) {
     if(i < 0) {
     break;
     } 
    ch = days.charAt(i);
    System.out.println(ch);
  }
 }
}