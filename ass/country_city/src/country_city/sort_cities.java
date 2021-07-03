/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country_city;

import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class sort_cities  implements Comparator<city_class> {

    @Override
    public int compare(city_class o1, city_class o2) {
        return o1.population-o2.population;
    }
    
}
