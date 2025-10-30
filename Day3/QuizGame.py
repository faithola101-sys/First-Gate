def QuizGame():

totalScore = 0;

print(" The capital of France is? ");
print("   (a) London (b) Rome (c) Paris " );
     
pick = input("Please enter your choice: ")

if pick == "c": 
        print("Excellent");
        totalScore += 1;
      
elif pick == "a" or pick == "b":
       print("wrong");
     
else:
     print("invalid input");
     

print("   Who is the president of nigeria? ");
print("       (a) Obama (b) Putin (c) Bola Ahmed Tinubu");
     
choose = input("Please choose your choice: ");

if choose == "c": 
     print("Excellent");
     totalScore += 1;
     

elif choose == "a" or choose == "b":
     print("wrong");
     
else:
     print("invalid input");
    

print("   Who love's trouble the most in cohort 27 ? ");
print("        (a) Stanley (b) Nissi (c) Nelson ");
     
type = input("Please type your choice: ");

if type == "c":
      print("Excellent");
      totalScore += 1;
     
elif type == "a" or type == "b":
     print("wrong");
     
else:
     print("invalid input");
    
     
     print(totalScore);
     return totalScore

()QuizGame