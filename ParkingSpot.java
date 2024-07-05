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
public class ParkingSpot {
    int parking_spot_no;
    boolean avialable;
    private Car car;
    
    
    ParkingSpot(int parking_spot_no){
    this.parking_spot_no=parking_spot_no;
    this.avialable=true;
    this.car=null;
    }
    
    public void occupy(Car car){
    this.car=car;
    this.avialable=false;
    }
    
    public void vacent(){
    this.car=null;
    this.avialable=true;
    }

  public Car getCar(){
  return car;}
}
