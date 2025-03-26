package com.java.lab4;

class Car extends Vehicle {
public Car(Workshop w1, Workshop w2) 
    { 
        super(w1, w2); 
    } 
  
    @Override public void manufacture() 
    { 
        System.out.print("Car "); 
        w1.work(); 
        w2.work(); 
    } 
  
} 