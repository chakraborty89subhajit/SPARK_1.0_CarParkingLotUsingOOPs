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
public class Car {
    String licence_plate_no;
    
    Car(String licence_plate_no){
        this.licence_plate_no=licence_plate_no;
        
    }
    
    public String getLicence_plate_no(){
    return licence_plate_no;
    }
    
}
