import java.util.Scanner;

public class FinalScore {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("\nQUESTIONS");

String [] questions = {"How many letters do we have in english ? ", "How many state is in nigeria? ", "Who's the best player in the world? ", "Who died for the sins of the world? ", "Which country has the highest population? ", "Which country get Pound? ", "Which animal be king for jungle? ", "Which of the fish is the sea is the largest? ", "Who got the higest grammy in the world? ", "who's the richest man in the world? "};


   

   for(int i = 0; i < questions.length; i++) {
     System.out.println((i+1) + " " + questions[i]);
    }
     
  System.out.println("\n\tCHOOSE FROM THE QUESTION ABOVE BTW(1-10)");
    String pick = input.nextLine();
        

        if (pick.equals("1")) {
        System.out.print(questions[0]);
        String question = input.nextLine();
   
          if (question.equals("26")) {
          System.out.println("Pass");
         }
          else {
          System.out.print("Fail");
         }
      }
       
     
       
       else if (pick.equals("2")) {
       System.out.print(questions[1]);
       String quest = input.nextLine();
          
         if (quest.equals("36")) {
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
     }
   
   else if (pick.equals("3")) {
   System.out.print(questions[2]);
   String ques = input.nextLine();

         if (ques.equals("messi")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
    }
    
     else if (pick.equals("4")) {
     System.out.print(questions[3]);
     String a = input.nextLine();

         if (a.equals("jesus")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
    }

     else if (pick.equals("5")) {
     System.out.print(questions[4]);
     String b = input.nextLine();

         if (b.equals("india")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
    }


     else if (pick.equals("6")) {
     System.out.print(questions[5]);
     String c = input.nextLine();

         if (c.equals("united kingdom")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
    }

     else if (pick.equals("7")) {
     System.out.print(questions[6]);
     String d = input.nextLine();

         if (d.equals("lion")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
    }


   else if (pick.equals("8")) {
     System.out.print(questions[7]);
     String e = input.nextLine();

         if (e.equals("wale")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
     }

     else if (pick.equals("9")) {
     System.out.print(questions[8]);
     String f = input.nextLine();

         if (f.equals("beyonce")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
     }
 
     else if (pick.equals("10")) {
     System.out.print(questions[9]);
     String g = input.nextLine();

         if (g.equals("elon musk")){
         System.out.print("Pass"); 
         } 
         else {
         System.out.print("fail");
        }
     }
  





}
}

