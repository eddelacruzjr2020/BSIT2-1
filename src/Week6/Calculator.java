/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Calculator {
    
    private int firstInteger, secondInteger, sumInt;
    private double firstDouble, secondDouble, sumDouble;
    private String firstString, secondString, concatenate;
    
    public void add(int firstInteger, int secondInteger){
        sumInt = firstInteger + secondInteger;
        System.out.println("The sum of 2 integer is "+sumInt);
    }
    
    public void add(double firstDouble, double secondDouble){
        sumDouble = firstDouble + firstDouble;
        System.out.println("The sum of 2 double is "+sumDouble);
    }
    
    public void add(String firstString, String secondString){
        concatenate = firstString + secondString;
        System.out.println("The contatenate of 2 string is "+concatenate);
    }
    
}
