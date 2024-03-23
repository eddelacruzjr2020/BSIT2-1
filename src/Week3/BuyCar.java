/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class BuyCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car carObject = new Car("blue", 70);
        // Can access the public variable, color, in this class
        String carColor = carObject.color;
        // Can’t access the private variable, speed, in this class
        // int carSpeed = carObject.speed -- This results in an error, can’t access speed here

    }
    
}
