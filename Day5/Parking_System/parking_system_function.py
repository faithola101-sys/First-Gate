
def parking_system(car_parked, parking_slot):
    
    available_space = parking_slot - car_parked
  
    filled_space = parking_slot - available_space
 
    return car_parked, available_space, filled_space

parking_slot = 20

print("\t We got just 20 Parking slot here") 

pick = input("\t\t\nYou go like park? (a)yes (b)no: ")

for i in range(1):
    if pick == 'a':
         print("Oya Wole Konle")
         car_parked = int(input("\n\t\tEnter number of car: "))
    else:
         print("Invalid choice.")
         break
   
result = parking_system(car_parked, parking_slot)  

print("car_parked:", result[0])
print("available_space:", result[1])
print("filled_space:", result[2])



