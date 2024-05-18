/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11.BikeBicycle;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle();
        bicycle.gear(12);
        bicycle.speed(12);
        bicycle.brake(5);
        
        System.out.println("Bicycle State is:");
        bicycle.printStates();
        
        
        Bike bike = new Bike();
        bike.gear(4);
        bike.speed(4);
        bike.brake(3);
        
        System.out.println("Bike State is:");
        bike.printStates();
        
        
    }
    
}
