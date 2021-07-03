/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country_city;

/**
 *
 * @author Lenovo
 */
public class country_class {
    String country,iso3;

    public country_class(String country, String iso3) {
        this.country = country;
        this.iso3 = iso3;
    }

    @Override
    public String toString() {
        return "country_class{" + "country=" + country + ", iso3=" + iso3 + '}';
    }
    
    
}
