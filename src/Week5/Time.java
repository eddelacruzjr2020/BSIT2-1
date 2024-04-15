/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Time {
    
    private int hours;
    private int minutes;
    private int seconds;
    
    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    //Setter and Getter methods
    // Method to set time for hours
    public void setHours(int hours) {
            this.hours = hours;

    }

    // Method to set time for minutes
    public void setMinutes(int minutes) {
            this.minutes = minutes;
    }

    // Method to set time for seconds
    public void setSeconds(int seconds) {
            this.seconds = seconds;
    }
    
    public int getHours() {
            return hours;

    }

    public int getMinutes() {
            return minutes;
    }

   
    public int getSeconds() {
            return seconds;
    }
    
    

    // Method to display time
    public void display() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    
}
