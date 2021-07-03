/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise.pkg2;

/**
 *
 * @author Lenovo
 */


public class LabExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        boolean result = classformethod.check((b,a) -> {
            if (b.length()>a.length()) {
                System.out.println(b);
                return true;
            } else {
                System.out.println(a);
                return false;
            }
            
        }, "ahmed","monaaaaaaaaaaa");
       System.out.println("The result is: "+ result);
    }
    
}
