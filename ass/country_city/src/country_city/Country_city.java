/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country_city;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo
 */



public class Country_city {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String mapkey;
       Map map=new HashMap(); 
        
        
        countryDAO co = new countryDAO();
        List<country_class> allcountry = co.getdata("D:\\AI-PRO\\java\\lesson3\\ass\\countries.csv");
        
        cityDAO ct = new cityDAO();
        List<city_class> allcity = ct.getdata("D:\\AI-PRO\\java\\lesson3\\ass\\cities.csv");
        
        Collections.sort(allcity, new sort_cities());
        
        for (int i =0;i<allcountry.size();i++){
            country_class o = allcountry.get(i);
            mapkey=o.iso3;
            List<city_class> mapobject = new ArrayList<city_class>();
            for (int j =0;j<allcity.size();j++){
                city_class c = allcity.get(j);
                if(mapkey.equals(c.iso3)){
                    mapobject.add(c);
                    
                }
            }
            map.put(mapkey, mapobject);
            map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
        }    
}
}