package problemasProgramacionFichero;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tema1.Rios.EJEMLOOO;

public class ejemploEjercicio68___ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean comprobacion = true;
        
        
        try {
            EJEMLOOO f = new EJEMLOOO();
            String line = "";
            
            while(comprobacion){
                System.out.println("Introduce un datooo");
                
                line = scan.nextLine();
                f.anadirDatos(line);
                
                if(line.isEmpty()){
                    comprobacion = false;
                }
                line = "";
            }
            
            f.cerrarFlujoEscritura();
            
            
        } catch (IOException ex) {
            System.out.println("La escritura del fichero ha fallado");
            Logger.getLogger(ejemploEjercicio68___.class.getName()).log(Level.SEVERE, null, ex);
        }
         

        boolean com = false;

        do {
            System.out.println("mete un numero!!!!");
            try {
                double numero = scan.nextDouble();
                com = true;
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir un dato no correspondiente");
                scan.next();
            }

        } while (!com);

        
    }

}
