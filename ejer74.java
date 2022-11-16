
package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ejer74 {
    //definimos la ruta
    String ruta = "D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\inventario.txt"; 
    
    FileReader acceso;
    BufferedReader bufer;
    String datos;
    public ejer74() throws FileNotFoundException {
        acceso = new FileReader(ruta);
        bufer = new BufferedReader(acceso);
        
    }
    private void cerrarFlujoLectura() throws IOException {
        acceso.close();
        bufer.close();
    }
    public void inventarios () throws IOException {
        String line ="";
        while ((line = bufer.readLine()) != null) {
            
        String [] arr=line.split(":");
            //System.out.println("sout normal sin array"+line);
        
        System.out.println("Item:     "+arr[0]);
        System.out.println("Precio:   "+arr[1]);
        System.out.println("Cantidad: "+arr[2]);
            System.out.println("");
        
        }
        cerrarFlujoLectura();
    }
        
        
    


    public static void main(String[] args) {
        try { 
            ejer74 f = new ejer74();
            f.inventarios();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ejer74.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ejer74.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
