package problemasProgramacionFichero;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio71 {

    InputStream in;
    File origen;
    File destino;
    OutputStream out;

    public ejercicio71(InputStream in, File origen, File destino, OutputStream out) {
        this.in = in;

    }

 

    public void leeryescribir(String origen) throws IOException {
        //
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }

    }

    public void copiar() throws FileNotFoundException {
        //

    }

    public void cerar() throws IOException {
        in.close();
        out.close();
    }

    public static void main(String[] args) {
        
        try {
            
            
            
            
            
            File origen = new File("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\riosmolon.txt");
            File destino = new File("D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\crack.txt");
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

        } catch (IOException ex) {
            Logger.getLogger(ejercicio71.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
