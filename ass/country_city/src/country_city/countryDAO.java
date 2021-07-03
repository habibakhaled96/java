/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country_city;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class countryDAO implements country_city_interface<country_class> {
     List<country_class> countryobject;
    @Override
    public List<country_class> getdata(String path) {
        this.countryobject = new ArrayList<country_class>();
        File countryobject_info = new File(path);
        List<String> lines = new ArrayList<String>();
                
         try {        
             lines = Files.readAllLines(countryobject_info.toPath());
         } catch (IOException ex) {
             Logger.getLogger(countryDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(int ind=1;ind<lines.size();ind++){
            String line = lines.get(ind);
            String[] fields = line.split(",");
            for(int indx=0;indx<fields.length;indx++){
                fields[indx] =fields[indx].trim();
                
            }
            //System.out.println(fields[ind]);
            country_class pyc = new country_class(fields[0],fields[1]);
            countryobject.add(pyc);
        }
        
        
        return countryobject;        
         
         
         
        
    }
    
}
