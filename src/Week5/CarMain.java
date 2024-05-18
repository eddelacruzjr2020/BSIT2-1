/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "Mustang", 2024);
       // vehicle.viewDetails();
        
        Car car = new Car("Honda", "Civic", 2024, 4);
        car.viewDetails();
    }
    
}
