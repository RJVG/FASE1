/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 //Con base en: http://www.lawebdelprogramador.com/codigo/Java/2676-Crear-un-laberinto-y-encontrar-el-camino-applet.html
package laberinto;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Escenarios {
//LABERINTOS PRE-HECHOS
    Scanner lector = new Scanner(System.in);

        
    public Matrices laberintos = new Matrices();

    public String[][] escenarioUno() {
        
        String[][] matriz = laberintos.getMatriz1();
        return matriz;
    }

    public String[][] escenarioDos() {
        
        String[][] matriz = laberintos.getMatriz2();
        return matriz;
    }

    public String[][] escenarioTres() {
        
        String[][] matriz = laberintos.getMatriz3();
        return matriz;
    }
    
        public String[][] escenarioCuatro() {
            
        String[][] matriz = laberintos.getMatriz4();
        return matriz;
    }
        
        public String[][] escenarioCinco() {
            
        String[][] matriz = laberintos.getMatriz5();
        return matriz;
    }


    public int filaasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    public int columasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = j;
                }
            }
        }
        return fila;
    }
     int [] arreglo= new int[2];
     public int [] posX(String [][]matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[0].length; j++) {
                 if (matriz[i][j].equals("x")) {
                     arreglo[0]=i;
                     arreglo[1]=j;
                 }
             }
         }
         return arreglo;
     }
}
