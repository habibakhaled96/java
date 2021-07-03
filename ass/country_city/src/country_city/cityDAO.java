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
public class cityDAO implements country_city_interface<city_class> {
    List<city_class> cityobject;
    @Override
    public List<city_class> getdata(String path) {
        this.cityobject = new ArrayList<city_class>();
        File cityobject_info = new File(path);
        List<String> lines = new ArrayList<String>();
                
         try {        
             lines = Files.readAllLines(cityobject_info.toPath());
         } catch (IOException ex) {
             Logger.getLogger(countryDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(int ind=1;ind<lines.size();ind++){
            String line = lines.get(ind);
            String[] fields = line.split(",");
            for(int indx=0;indx<fields.length;indx++){
                fields[indx] =fields[indx].trim();
            }
            String indx=fields[0];
            String iso3=fields[1];
            String city_ascii=fields[2];
            String lat=fields[3];
            String  lng=fields[4];
            String capital=fields[5];
            Integer population=Integer.parseInt(fields[6]);
            Integer id=Integer.parseInt(fields[7]);
            
            city_class pyc = new city_class(indx,iso3,city_ascii,lat,lng,capital,population,id);
            cityobject.add(pyc);
        }
        
        
        return cityobject; 
        
    }
    
}
