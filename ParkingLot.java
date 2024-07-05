/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carparkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ParkingLot {
    List<ParkingSpot>spots;
    
    
    public ParkingLot(int capacity){
    this.spots=new ArrayList<>();
    
    for(int i=0;i<capacity;i++){
        spots.add(new ParkingSpot(i));
    }
    }
    
    public boolean parkcar(Car car){
        for(ParkingSpot spot : spots){
        if(spot.avialable){
        spot.occupy(car);
            System.out.println(car.licence_plate_no+"  "+spot.parking_spot_no);
            return true;
        }
        }
      return false;  
    }
    
    
    public boolean removeCar(String licence_plate_no){
        for(ParkingSpot spot :spots){
        if((!spot.avialable)&& (spot.getCar().getLicence_plate_no().equalsIgnoreCase(licence_plate_no))){
        spot.vacent();
            System.out.println("car wirh "+licence_plate_no+" removed");
            return true;
        }
        }
        System.out.println(licence_plate_no+" not found");
        return false;
    }
    
    public void showAllCar(){
    System.out.println("all parked cars are:");
    for(ParkingSpot spot : spots){
    if(!spot.avialable){
   System.out.println("Spot " + spot.parking_spot_no + ": " + spot.getCar().getLicence_plate_no());
    }
    }
    }
    
    
     public void showAvilableSpot(){
    System.out.println("all avilable spots are:");
    for(ParkingSpot spot : spots){
    if(spot.avialable){
   System.out.println("Spot " + spot.parking_spot_no + " is avilable");
    }
    }
    }
}
