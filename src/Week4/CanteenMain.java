/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CanteenMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        //Student order 1
        Canteen order1 = new Canteen();
        order1.Order(1);
        
        //Student order 2
        Canteen order2 = new Canteen("brown rice");
        order2.Order(2);
        
        //Student order 3
        Canteen order3 = new Canteen("java rice", "Adobo");
        order3.Order(3);
        
        //Student order 4
        Canteen order4 = new Canteen("java rice", "Adobo", "Sioma");
        order4.Order(4);
        
        //Student order 5
        Canteen order5 = new Canteen("java rice", "Adobo", "Sioma","ice cream");
        order5.Order(5);
    }
    
}
