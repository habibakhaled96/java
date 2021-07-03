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
public class city_class {
    String indx,iso3,city_ascii,capital,lat,lng;
    
    Integer population,id;

    public city_class(String indx,String iso3, String city_ascii, String lat, String lng, String capital, Integer population, Integer id) {
        this.iso3 = iso3;
        this.indx = indx;
        this.city_ascii = city_ascii;
        this.lat = lat;
        this.lng = lng;
        this.capital = capital;
        this.population = population;
        this.id = id;
    }

    @Override
    public String toString() {
        return "city_class{" + "iso3=" + iso3 + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", capital=" + capital + ", population=" + population + ", id=" + id + '}';
    }
    
}
