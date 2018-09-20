/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class Truck {
    public int Cadence;
    public int Gear;
    public int Speed;
    public Truck (int startCadence, int startSpeed, int startGear){
        Gear = startGear;
        Cadence = startCadence;
        Speed = startSpeed;
    }
    public void setCadence (int newValue){
        Cadence = newValue;
    }
    public void setGear (int newValue){
        Gear = newValue;
    }
    public void applybrake (int Decrement){
        Speed = Decrement;
    }
    public void SpeedUp (int Increment){
        Speed = Increment;
    }
}
