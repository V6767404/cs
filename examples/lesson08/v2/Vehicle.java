package by.it.examples.lesson08.v2;

class Vehicle {
  int passengers; // number of passengers  
  int fuelcap;    // fuel capacity in gallons 
  int mpg;        // fuel consumption in miles per gallon 
 
  // Display the range. 
  void range() { 
    System.out.println("Range is " + fuelcap * mpg); 
  } 
} 