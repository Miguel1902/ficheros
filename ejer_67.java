package problemasProgramacionFichero;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import tema1.Rios.EJEMLOOO;

public class ejer_67 {

    //para la edad que vamos a introducir
    String edad;
    //para nombre que vas a introducir
    String nombre;

    FileOutputStream write;

    //CONTRUCTOR write
    public ejer_67() throws IOException {
        write = new FileOutputStream("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
    }

    //para escribir lo que va ha guardar el fichero
    /*
    public void conprobacion() throws IOException {
        //comprobamos si existe la ruta del fichero 

        boolean path = ruta.exists();
        //con el if si  existe nos borra el contenido 
        //si no existe nos lo crea
        if (path) {
            System.out.println("el archivo existe :( ");
            //si existe le borramos en contenido
            buferedW.write("");
        } else {//si no existe lo creamos
            System.out.println("el archivo no existete lo creo");
            File ruta = new File("C:\\accesoadatos\\hola.txt");
        }
    }*/

    public void escribirficheros(String dato) throws IOException {
        dato += "\n";
        byte[] nombre = dato.getBytes();
        write.write(nombre);

    }

    private void cerarFlujo() throws IOException {
        write.close();

    }

    public static void main(String[] args) {

        //pedimos el nombre y la edad con scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame tu edad: ");
        String edad = entrada.next();
        System.out.println("dame tu nombre: ");
        String nombre = entrada.next();

        try {
            ejer_67 p = new ejer_67();
            
            p.escribirficheros(edad);
            p.escribirficheros(nombre);
            p.cerarFlujo();
            
        } catch (IOException ex) {
            Logger.getLogger(ejer_67.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
           
        
            
        
        
        

    }

}
