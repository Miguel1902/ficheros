package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio69 {

    //leemos por caracteres..
    private FileReader acceso;
    //almacenamos los caracteres en un buferr!!
    private BufferedReader lectura;

    ///Contructorr...!!!!!!
    ///CONSTRUCTORRRRR!!!!
    public ejercicio69(String ruta) throws FileNotFoundException {
        acceso = new FileReader(ruta);
        lectura = new BufferedReader(acceso);
    }

    public void mostrar() throws IOException {
        int cont = 0;
        String line;
        String fila = cont + ":";

        line = lectura.readLine();

        while (line != null) {
            //
            fila += line;
            System.out.println(fila);
            fila = "";
            //
            cont++;
            line = lectura.readLine();
            fila = cont + ":" + line;
        }

        acceso.close();
        lectura.close();
    }

    public static void main(String[] args) {

        try {
            ejercicio69 f = new ejercicio69("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
            f.mostrar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ejercicio69.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ejercicio69.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

    }

}
