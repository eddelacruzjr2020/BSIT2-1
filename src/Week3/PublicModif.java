/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PublicModif {
    
    public void publicMethod(){
        System.out.println("Public Method");  
    }
    
    protected void protectedMethod(){
        System.out.println("Protected Method");  
    }
    
    void defaultMethod(){
        System.out.println("Default Method");  
    }
    
    private void privateMethod(){
        System.out.println("Private Method");  
    }  
       
    public static void main(String[] args) {
            PublicModif pm = new PublicModif();
            pm.publicMethod();
            pm.defaultMethod();
            pm.protectedMethod();
            pm.privateMethod();
        
    } 
    
    
    
}
