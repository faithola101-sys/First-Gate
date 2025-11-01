import java.util.Scanner;
import java.util.Arrays;

public class MiniParkingSlot.. {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       String[] parkingSlots = new String[20];

       String carName;
       char userInput;
       int count = 0;
 do {   
       
      System.out.println("\n============MiniParkingSLOT============");
      System.out.print("You go like park (a)Zoom in (b)no (c)Zoom out: ");
      userInput = input.next().toLowerCase().charAt(0);
      input.nextLine();

       if(userInput == 'a') {
            if(count < parkingSlots.length){
            System.out.print("Zoom in...Enter the name of the car?: ");
            carName = input.nextLine().toLowerCase();
            parkingSlots[count] = carName;
            count++;
                 
            System.out.println("Successfully parked");
            }
            else {
            System.out.print("Parking Slot Filled");
            }
       }
   
     else if (userInput == 'b') break;
     
     else if (userInput == 'c') {
     System.out.print("Zoom out...Remove car by entering Car name? :");
     String carNameRemove = input.nextLine().toLowerCase();
        
              if(parkingSlots[count] != null && parkingSlots[count].equalsIgnoreCase(carNameRemove)) {
              parkingSlots[count] = null;
              count--;
              System.out.println("Car removed successfully");
         
           } else if (count == 0) {
             System.out.println("\nNo car to remove");
           }
             else {
             System.out.println("\nCar not parked");
           }
        }
     
     else {
     System.out.println("invalid.....pick either (a) or (b)");
    }

     int slotAvailable = parkingSlots.length - count;
     System.out.print("\nSlots Available " + slotAvailable);
     System.out.println("\nCar Park: "+ Arrays.toString(parkingSlots));

  
  }   while(userInput != 'b');  
 } 
}