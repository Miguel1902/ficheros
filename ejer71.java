package problemasProgramacionFichero;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejer71 {

    public static void main(String[] args) {

        File origen = new File("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
        File destino = new File("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\crack.txt");

        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;
            try {
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                System.out.println("se ha copiado ");
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(ejer71.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ejer71.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
