/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carparkinglot;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String args[]){
    ParkingLot lot= new ParkingLot(5);
    Car car1= new Car("wb33a1234");
    Car car2= new Car("wb33a4567");
    Car car3= new Car("wb33a9876");
    
    lot.parkcar(car1);
    lot.parkcar(car2);
    lot.parkcar(car3);
    
    lot.removeCar("wb33a4567");
    lot.showAllCar();
    lot.showAvilableSpot();
    }
}
