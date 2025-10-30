num = 2;

square = False;
    

lists = [4,9,25,49];
    
   
for i in range(len(lists)): 
      result = lists[i];
     
num = result / num;
square = False;
     
if num * num >= result:
     square = True; 
    
num += 1;
print(result + "." + square);
   
 