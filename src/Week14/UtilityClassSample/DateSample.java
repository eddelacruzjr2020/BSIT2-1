/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.UtilityClassSample;

import java.util.Date;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class DateSample extends RandomSample{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1, d2, d3;
        d1 = new Date();
        d2 = new Date(System.currentTimeMillis());
        d3 = new Date("6/30/2023 18:07");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        }
    }

