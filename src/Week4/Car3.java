/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Car3 {
   
    String make;
    String model;
    int year;
    
    Car3(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }   
    
    public void setMake(){
        this.make = make;
    }
    
    public void setModel(){
        this.model = model;
    }
    
    public void setYear(){
        this.year = year;
    }   
    
    public void vehicleDetails(){
        System.out.println("Your vehicle is Make: "+make+" Model: "
                + ""+model+
                " Year: "+year);
    }
}
