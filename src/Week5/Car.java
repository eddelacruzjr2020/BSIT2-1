/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Car extends Vehicle{
    
    int numTires;
    
    Car(String model, String make, int year, int numTires){
        super(make, model, year);
        this.numTires = numTires;
    }
    
    //Setter and Getter method
    public void setNumTires(int numTires){
        this.numTires = numTires;
    }
    
    public int getNumTires(){
        return numTires;
    }
    
 
    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Number of Tires: "+numTires);
    }
    
    
}
