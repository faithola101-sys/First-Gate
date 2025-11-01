num = 2
lists = [4, 9, 7, 25, 49];  
                               
for item in lists:      
    result = item / num
    isSquare = False
     
    if result * result >= item:
     isSquare = True
 
    num += 1
    print(item, "=>" ,isSquare)
   
   