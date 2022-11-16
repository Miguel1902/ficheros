
package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ejercicio70 {
    //leemos por caracteres..
    private FileReader acceso;
    //almacenamos los caracteres en un buferr!!
    private BufferedReader lectura;

    ///Contructorr...!!!!!!
    ///CONSTRUCTORRRRR!!!!
    public ejercicio70(String ruta) throws FileNotFoundException {
        acceso = new FileReader(ruta);
        lectura = new BufferedReader(acceso);
    }
    public void leer() throws IOException {
        
        String line;
        

        line = lectura.readLine();
        
        int mayor=0;
        while (line != null) {
                
            if(mayor<line.length()){
                mayor=line.length();
            }
            line = lectura.readLine();
            
            
        }
        System.out.println("la linea mayor tiene: "+mayor+" caracteres");
        acceso.close();
        lectura.close();
    }
    

 
    public static void main(String[] args)  {
        try {
            ejercicio70 f = new ejercicio70("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
            
                f.leer();
            } catch (IOException ex) {
                Logger.getLogger(ejercicio70.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        
    }
    
}
