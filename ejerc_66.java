/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemasProgramacionFichero;

import java.io.*;
import java.util.*;

/**
 *
 * @author migue
 */
public class ejerc_66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el nombre de un fichero: ");
        String fichero = entrada.nextLine();
        File direc = new File("C:\\acesoadatos\\" + fichero);
        boolean path;
        path = direc.exists();
        if (path) {
            System.out.println("el arhivo existe");

        } else {
            System.out.println("el arhivo no existe, vamos a abrir un fichero diferente");
            direc = new File("C:\\acesoadatos\\aurora.txt");
            System.out.println("este otro fichero contiene esto: ");
        }
        try {
            FileReader fw = new FileReader(direc);
            BufferedReader bf = new BufferedReader(fw);
            String cadena = "";
            while ((cadena = bf.readLine()) != null) {
                System.out.println("");
                System.out.println(cadena);
            }
        } catch (Exception e) {
            System.out.println(" error por " + e);
        }

    }

}
