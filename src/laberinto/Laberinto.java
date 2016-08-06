/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escenarios esce = new Escenarios();
        Metodo metodo = new Metodo();

        Scanner lector = new Scanner(System.in);
        int opc;
        int mod = 0;
        //POSIBLES LABERINTOS
        do {
            System.out.println("1.-Laberinto 1");
            System.out.println("2.-Laberinto 2");
            System.out.println("3.-Laberinto 3");
            System.out.println("4.-Laberinto 4");
            System.out.println("5.-Laberinto 5");
            System.out.println("0.- Salir");
            System.out.print("opcion ->");
            opc = lector.nextInt();
            if (opc != 0) {
                System.out.println("1.- Presione 1 para iniciar");
                mod = lector.nextInt();
            }
//INICIO DE RESOLUCION PARA CADA CASO DE LABERINTO
            switch (opc) {
                case 0:
                    System.out.println("Adios!");
                    break;
                case 1:
                        metodo.Resolver(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    break;
                case 2:
                        metodo.Resolver(esce.escenarioDos(), esce.filaasterico(esce.escenarioDos()), esce.columasterico(esce.escenarioDos()));
                    break;
                case 3:
                        metodo.Resolver(esce.escenarioTres(), esce.filaasterico(esce.escenarioTres()), esce.columasterico(esce.escenarioTres()));
                    break;
                case 4:
                        metodo.Resolver(esce.escenarioCuatro(), esce.filaasterico(esce.escenarioCuatro()), esce.columasterico(esce.escenarioCuatro()));
                    break;
                case 5:
                        metodo.Resolver(esce.escenarioCinco(), esce.filaasterico(esce.escenarioCinco()), esce.columasterico(esce.escenarioCinco()));
                    break;

                default:
                    System.out.println("Seleccione una opción disponible");
                    System.out.println(" ");
            }
        } while (opc != 0);

    }
}
