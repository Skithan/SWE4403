package com.java.lab4;

class Truck extends Vehicle {
public Truck(Workshop w1, Workshop w2) 
    { 
        super(w1, w2); 
    } 
  
    @Override public void manufacture() 
    { 
        System.out.print("Truck "); 
        w1.work(); 
        w2.work(); 
    } 
  
} 