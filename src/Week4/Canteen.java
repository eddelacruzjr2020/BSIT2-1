/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Canteen {
    
    String rice;
    String ulam1;
    String ulam2;
    String dessert;
   
    Canteen(){
        System.out.println("Wala kang order");
    }
    
    Canteen(String rice){
        this.rice = rice;
    }
    
    Canteen(String rice, String ulam1){
    this.rice = rice;
    this.ulam1 = ulam1;
    }
    
    Canteen(String rice, String ulam1, String ulam2){
    this.rice = rice;
    this.ulam1 = ulam1;
    this.ulam2 = ulam2;
    }
    
    Canteen(String rice, String ulam1, String ulam2, String dessert){
    this.rice = rice;
    this.ulam1 = ulam1;
    this.ulam2 = ulam2;
    this.dessert = dessert;
    }
    
    public void Order(int studID){
        System.out.println("Student #"+studID+" Your order are "+rice+" \nUlam 1: "+ulam1+" \nUlam2 "+ulam2+" \nDessert: "+dessert);
    }
}
