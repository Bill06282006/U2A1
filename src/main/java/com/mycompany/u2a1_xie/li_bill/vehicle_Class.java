/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_xie.li_bill;

/**
 *
 * @author 334984945
 */
public class vehicle_Class {
    private String licensePlate;
    private int passengerNum;
    private double passengerFare,fuelEfficiency ;
    private static double distance,gasPrice;
    
    //constructers 
    public vehicle_Class(String licensePlate, int passengerNum, double passengerFare, double fuelEfficiency) {
        this.licensePlate = licensePlate;
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    //setters

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public void setPassengerFare(double passengerFare) {
        this.passengerFare = passengerFare;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public static void setDistance(double distance) {
        vehicle_Class.distance = distance;
    }

    public static void setGasPrice(double gasPrice) {
        vehicle_Class.gasPrice = gasPrice;
    }
    
    //getters

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public double getPassengerFare() {
        return passengerFare;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public static double getDistance() {
        return distance;
    }

    public static double getGasPrice() {
        return gasPrice;
    }
    
    
  
    
}
