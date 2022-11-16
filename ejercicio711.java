package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio711 {

    //leemos por caracteres..
    private FileReader acceso;
    //almacenamos los caracteres en un buferr!!
    private BufferedReader lectura;

    String ruta;

    public ejercicio711(String ruta) throws FileNotFoundException {
        this.ruta = ruta;
        //llamamos a la clase inizialización
        inicializarBuffer();
    }

    //inicializacion del buffer
    private void inicializarBuffer() throws FileNotFoundException {
        acceso = new FileReader(ruta);
        lectura = new BufferedReader(acceso);
    }

    //clase para cerrar el buffer 
    private void cerrarBuffer() throws IOException {
        //cerramos la clase del buffer
        lectura.close();
    }

    //ahora creamos una clase para leer el fichero 
    private int leer() throws IOException {
        //inicializamos el buffer
        inicializarBuffer();

        //creamos la clase line y la igualamos a lectura que es la clase buffer
        //que nos enseñe la linea 1 
        String line = lectura.readLine();
        //creamos el cont para contar las lineas
        int cont = 0;
        //creamos un boolean
        Boolean f = true;
        //ahora hacemos un bucle while que mientras que f (el boolean) no sea
        // false va ha funcionar 
        while (f) {
            //creamos un if que line sea igual a null pues ponemos f false
            if (null == line) {
                f = false;
                //ahora creamos un else con el que si cont es menor al numero de lineas
                //cont es igual a line.length(), y asi tenemos el mas grande
            } else if (cont < line.length()) {
                //igualamos cont al numero de caracteres de linea
                cont = line.length();
            }
            //aqui lo que hacemos esq pase en la siguiente vuelta 
            //a la siguiente linea 
            line = lectura.readLine();

        }
        //cerramos el buffer 
        cerrarBuffer();
        //esto lo que hace esq sirve para que en la siguiente clase
        //nos coga el valor de cont
        return cont;

    }

    //con esta clase vemos la primera frase mas larga.
    public void primera() throws IOException {
        //aqui lo que hacemos es que inicializamos la clase max 
        //y la igualamos a cont de la clase leer();
        int max = leer();
        //inicualizamos el buffer
        inicializarBuffer();
        //creamos otra vez un line 
        String line = lectura.readLine();

        //creamos un boolena 
        boolean com = true;
        //creamos un while que mientras line sea diferente a null siga
        while (line != null) {
            //creamos una condicion que max sea igual a line.length()
            if (max == line.length()) {
                //escribimos la frase
                System.out.println("la primera linea es: "+line);
                //igualamos line a null para que en la siguiente falle 
                line = null;
                //con esta variable lo que hacemos es que no nos lea la
                //siguiente linea 
                com = false;
            }
            //este if nos hace que si com es true nos lea la frase para mostrar la siguiente 
            if (com) {
                line = lectura.readLine();
            }

        }
        //cerramos el buffer 
        cerrarBuffer();
        System.out.println("");
    }

    //para ver la ultima frase mas larga 
    public void ultima() throws IOException {
        //aqui lo que hacemos es que inicializamos la clase max 
        //y la igualamos a cont de la clase leer();
        int max = leer();
        //inicualizamos el buffer
        inicializarBuffer();
        //creamos otra vez un line 
        String line = lectura.readLine();
        String h = "";

        //creamos un boolena 
        boolean com = true;
        //creamos un while que mientras line sea diferente a null siga
        while (line != null) {
            //creamos una condicion que max sea igual a line.length()
            if (max == line.length()) {
                //esto lo que hace es que 
                h = line;

            }
            //este if nos hace que si com es true nos lea la frase para mostrar la siguiente 
            if (com) {
                line = lectura.readLine();
            }

        }
        //esto lo que hace es que nos muestre la ultima linea que se ha guardado 
        //en la variable h 
        System.out.println("la ultima linea es: "+h);
        //cerramos el buffer 
        cerrarBuffer();
        System.out.println("");
    }

    public void todas() throws IOException {
//aqui lo que hacemos es que inicializamos la clase max 
        //y la igualamos a cont de la clase leer();
        int max = leer();
        //inicualizamos el buffer
        inicializarBuffer();
        //creamos otra vez un line 
        String line = lectura.readLine();
        

        //creamos un boolena 
        boolean com = true;
        //para enseñar las lienas mas largas 
        System.out.println("las lineas mas largas son: ");
        //creamos un while que mientras line sea diferente a null siga
        
        while (line != null) {
            //creamos una condicion que max sea igual a line.length()
            if (max == line.length()) {
                //esto lo que hace es que 
                
                
                System.out.println(line);
                
            }
            
            //este if nos hace que si com es true nos lea la frase para mostrar la siguiente 
            if (com) {
                line = lectura.readLine();
            }

        }
        //esto lo que hace es que nos muestre la ultima linea que se ha guardado 
        //en la variable h 
        
        //cerramos el buffer 
        cerrarBuffer();
    }

    public static void main(String[] args) {
        try {
            ejercicio711 f = new ejercicio711("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
            f.primera();
            f.ultima();
            f.todas();
        } catch (IOException ex) {
            Logger.getLogger(ejercicio711.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

    }

}
