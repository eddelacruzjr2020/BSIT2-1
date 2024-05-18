/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.BikeBicycle;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Bicycle implements Vehicles {
    
    private int gear, speed, brake;

    @Override
    public void gear(int newGear) {
        gear=newGear;
    }

    @Override
    public void speed(int increment) {
        speed = speed + increment;
    }

    @Override
    public void brake(int decrement) {
        speed = speed - decrement;
    }
    
    public void printStates(){
        System.out.println("speed: "+speed+" \ngear:"+gear);
    }
    
}
