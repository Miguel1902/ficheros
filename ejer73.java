package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejer73 {
    //ruta de donde va ha estar el archivo a tratar.

    String ruta = "D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\numeros.txt";

    //constructor
    public ejer73() {

    }

    public void numeros() throws FileNotFoundException, IOException {
        //para poder acceder a los ficheros. 
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        String line;
        //para contar cuantos caracteres ahi
        int h = 0;
        int nummayor = 0;
        int nummenor = 9;
        //con esto vemos cuantas lineas tinee nuestro fichero
        while ((line = br.readLine()) != null) {

            h++;

            int num0 = Integer.parseInt(line);

            if (nummayor < num0) {
                nummayor = num0;
            }else if (nummenor > num0) {
                nummenor = num0;
            }
        }
        //cerramos 
        br.close();
        fr.close();

        FileReader f = new FileReader(ruta);
        BufferedReader b = new BufferedReader(f);

        int mayor = 0;
        int menor = 0;
        for (int i = 1; i <= h; i++) {
            String a = b.readLine();
            int num0 = Integer.parseInt(a);

            if (num0 == nummayor) {
                mayor++;
            }
            if (num0 == nummenor) {
                menor++;
            }

        }

        System.out.println("el numero menor es: " + nummenor);
        System.out.println("el numero menor aparece : " + menor);
        System.out.println("el numero mayor es: " + nummayor);
        System.out.println("el numero mayor aparece : " + mayor);
    }

    public static void main(String[] args) {
        //para poder mencionar las clases.

        try {
            ejer73 f = new ejer73();
            f.numeros();
        } catch (IOException ex) {
            Logger.getLogger(ejer73.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
