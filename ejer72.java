package problemasProgramacionFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejer72 {

    String ruta = "D:\\ESCRITORIO\\acceso a datos\\src\\problemasProgramacionFichero\\carta.txt";

//constructor 
    public ejer72() {

    }
    
    

    public void caracteres() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);

        int h = 0;

        String linea;
        while ((linea = br.readLine()) != null) {
            //para mostrar lo que lee
            //System.out.println(linea);

            h = linea.length() + h;

        }
        System.out.println("tiene " + h + " caracteres");
        br.close();
    }

    public void lineas() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(ruta);
        BufferedReader br = new BufferedReader(fr);
        int h=0;
        String line;
        while ((line = br.readLine()) != null) {
           h++;
        }
        
        
        System.out.println("tiene " + h + " lineas");
        br.close();
    }
    
    public void palabras()  {
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            int i,j,a=0;
            String linea;
            while((linea = br.readLine()) != null){
                for(i=0;i<linea.length();i++){
                    if(i==0){
                        if(linea.charAt(i)!=' ')
                            a++;
                    }else{
                        if(linea.charAt(i-1)==' ')
                        if(linea.charAt(i)!=' ')
                            a++;
                    }
                }
                
            }
            System.out.println("son "+ a+" palabras");
            br.close();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ejer72.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void main(String[] args) {

        try {
            ejer72 f = new ejer72();
            f.caracteres();
            f.lineas();
            f.palabras();
        } catch (IOException ex) {
            Logger.getLogger(ejer72.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
