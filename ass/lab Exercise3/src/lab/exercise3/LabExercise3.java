/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise3;

/**
 *
 * @author Lenovo
 */
public class LabExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result = false;
        result = classformethod.check1((x) -> {
            for(int i=0;i<x.length();i++){
                
                if (Character.isLetter(x.charAt(i))) {
                    System.out.println("it is char "+ x.charAt(i));
                } else {
                    System.out.println("it is not char "+ x.charAt(i));
                }
            }
            return false;
            
        }, "ah8mnhgkg*ed2");
      System.out.println("The result is: "+ result);
    }
    
}
