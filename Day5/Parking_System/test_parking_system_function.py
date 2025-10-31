import unittest 
from parking_system_function import parking_system, car_parked, parking_slot, available_space

class TestParkingSystemFunction(unittest.TestCase):
    
      def test_car_parked_is_empty(self):
        result = parking_system(0,20)
        self.assertEqual(result, (0,20,0))

      def test_car_parked_is_filled(self):
        result = parking_system(20,20)
        self.assertEqual(result, (20,0,20))

      def test_car_parked_is_half_filled(self):
        result = parking_system(10,20)
        self.assertEqual(result, (10,10,10))

      def test_parking_system_zero(self):
        result = parking_system(0, 0)
        self.assertEqual(result, (0,0,0))

     
          
         
