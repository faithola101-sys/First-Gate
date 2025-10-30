import java.util.Scanner;
public class QuizGame {


     public static void main(String[] args) {
     int score = quizGame();




    }


     public static String quizGame() {

     Scanner input = new Scanner(System.in);
     
     int totalScore = 0;

System.out.println(" The capital of France is? ");
System.out.println("  (a) London (b) Rome (c) Paris (d) Canada " );
     
     String pick = input.nextLine();

     if (pick.equals("c")) {
        System.out.println("Excellent");
        totalScore++;
     }

else if (pick.equals("a") || pick.equals("b") || pick.equals("d")){
       System.out.println("wrong");
     }
       else {
     System.out.println("invalid input");
     }

System.out.println("   Who is the president of nigeria? ");
System.out.println("       (a) Obama (b) Putin (c) Bola Ahmed Tinubu");
     
     String choose = input.nextLine();

     if (choose.equals("c")) {
     System.out.println("Excellent");
     totalScore++;
     }

     else if (choose.equals("a") || choose.equals("b")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }

System.out.println("   Who love's trouble the most in cohort 27 ? ");
System.out.println("        (a) Stanley (b) Nissi (c) Nelson ");
     
     String type = input.nextLine();

     if (type.equals("c")) {
      System.out.println("Excellent");
      totalScore++;
     }

     else if (type.equals("a") || type.equals("b")) {
     System.out.println("wrong");
     }
     else {
     System.out.println("invalid input");
    }
     
 System.out.println("Total Score" + totalScore++);

 }
}