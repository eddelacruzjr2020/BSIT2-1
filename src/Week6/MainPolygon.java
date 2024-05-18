/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MainPolygon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Rectangle Area Calculation
        Rectangle rec = new Rectangle(4.5, 5.5);
        System.out.println("Area of Rectangle is "+rec.calculateArea());
        
        //Triangle Area Calculation
        Triangle tri = new Triangle(3.90, 10.5);
        System.out.println("Area of Triangle is "+tri.calculateArea());
        
        //Polygon area Calculation
        Polygon poly = new Polygon(10.0, 50.0);
        System.out.println("Area of Triangle is "+poly.calculateArea());
        
               
    }
    
}
