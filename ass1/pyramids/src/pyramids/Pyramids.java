/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Pyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pyramidsDAO pd = new pyramidsDAO();
    
        List<pyramids_class> allpyramid = pd.getdata("D:\\AI-PRO\\java\\lesson2\\ass1\\pyramids.csv");
        for (int i =0;i<allpyramid.size();i++){
            System.out.println(allpyramid.get(i));
        }
    }
    
}
