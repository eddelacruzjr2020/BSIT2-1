/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Vehicle {
    
    String model;
    String make;
    int year;
    
    public Vehicle(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
    
    //Setter and Getter methods
    public void setModel(String model){
        this.model = model;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getMake(){
        return make;
    }
    
    public int getYear(){
        return year;
    }
    
    public void viewDetails(){
        System.out.println("Your Vehicle details are: \nMake: "+make+"\nModel: "+model+"\nYear: "+year);
    }
}
