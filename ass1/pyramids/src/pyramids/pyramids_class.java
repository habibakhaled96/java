/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author Lenovo
 */
public class pyramids_class {
    
    String pharaoh,ancientname,modernname,site, base1,base2,height,slope;

    public pyramids_class(String pharaoh, String ancientname, String modernname, String site, String base1, String base2, String height, String slope) {
        this.pharaoh = pharaoh;
        this.ancientname = ancientname;
        this.modernname = modernname;
        this.site = site;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.slope = slope;
    }

    @Override
    public String toString() {
        return "pyramids_class{" + "pharaoh=" + pharaoh + ", site=" + site + ", height=" + height + '}';
    }

    
    
}
