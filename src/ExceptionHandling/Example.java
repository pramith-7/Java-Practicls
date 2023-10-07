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
public class Example {
 
    public static void main(String[] args){
        try {
            int x = 10;
            int y = 0;
            int fraction = x/y;
            int g[] = {1};
            g[20] = 100;
//        } catch (Exception e) {
//            System.out.println("In the catch block due to exception :" +e);
//        }
        } catch (ArithmeticException e) {
            System.out.println("In the catch block due to exception :" +e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("In the catch block due to exception :" +e);
        }
        System.err.println("End of Main");
    }
}
