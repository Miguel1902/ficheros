package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio72 {

    String ruta;
    private FileReader archivo;
    private BufferedReader lectura;

    public ejercicio72(String ruta) throws FileNotFoundException {
        this.ruta = ruta;
        inicializarbuffer();

    }

    public void inicializarbuffer() throws FileNotFoundException {
        archivo = new FileReader(ruta);
        lectura = new BufferedReader(archivo);

    }

    public void cerrar() throws IOException {
        lectura.close();
    }

    public void leer() throws IOException {
        String line = lectura.readLine();
        boolean f = true;
        int cont = 0;
        for(int i=0;i<line.length();i++) {
            //if (null == line) {
               // f = false;
                
            //}else {
                cont++;
                //System.out.println(cont);
                System.out.println(line);
            //}
        }

        System.out.println("el numero de lineas es: " + cont);

    }

    public static void main(String[] args) throws FileNotFoundException {

        try {
            ejercicio72 f = new ejercicio72("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\carta.txt");
            f.leer();
            f.cerrar();
        } catch (IOException ex) {
            Logger.getLogger(ejercicio72.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
