/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PaintCar {
    // Accessing the color field of Car (public)
    public void changeColor(Car car, String newColor){
        car.color = newColor;
        System.out.println("Car color changed to: "+newColor);
    // Unable to access speed or local variables of Car methods from here
    }   
    
}
