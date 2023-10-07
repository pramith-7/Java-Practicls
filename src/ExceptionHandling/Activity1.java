/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Asus Tuf Gaming F15
 */
public class Activity1 {
    
    public static void main (String []args){
        
        int [] myList = {1,2,6};
        
        try {
            System.out.println(myList[5]);
        } catch (Exception e) {
            System.out.println("Error :" +e);
        }
        
    }
 
    
    
}
