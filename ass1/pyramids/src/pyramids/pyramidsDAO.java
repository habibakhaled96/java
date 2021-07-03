/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class pyramidsDAO implements pyramids_interface {
    List<pyramids_class> py;
    @Override
    public List<pyramids_class> getdata(String path) {
        
        this.py = new ArrayList<pyramids_class>();/*??*/
        
        
        File py_info = new File(path);
        
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(py_info.toPath());
        } catch (IOException ex) {
            Logger.getLogger(pyramidsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int ind=1;ind<lines.size();ind++){
            String line = lines.get(ind);
            String[] fields = line.split(",");
            for(int indx=0;indx<fields.length;indx++){
                fields[indx] =fields[indx].trim();
            }
            pyramids_class pyc = new pyramids_class(fields[0],fields[1],fields[2],fields[4],fields[5],fields[6],fields[7],fields[8]);
            py.add(pyc);
        }
        
        
        return py;
    }
    
}
