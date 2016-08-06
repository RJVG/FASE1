/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;


/**
 *
 * @author Rodrigo
 */
public class Metodo {

//IMPRESION DE LABERINTO
    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

//INICIO DE LECTURA DE ESPACIOS O POSIBLES MOVIMIENTOS
    public void Resolver(String[][] matriz, int filas, int colum) {
        String labe = "x";
        String direccion = "derecha";
        Escenarios x = new Escenarios();
        int []arreglo = x.posX(matriz);
        while (matriz[filas][colum] != matriz[arreglo[0]][arreglo[1]]) {
            imprimirMatriz(matriz);
            switch (direccion) {
                case "derecha"://DERECHA
                    if (!matriz[filas - 1][colum].equals("a") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                        matriz[filas - 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas--;
                        direccion = "arriba";
                    } else {
                        if (!matriz[filas][colum + 1].equals("a") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                            matriz[filas][colum + 1] = "*";
                            matriz[filas][colum] = " ";
                            colum++;
                        } else {
                            if (!matriz[filas + 1][colum].equals("a") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                                matriz[filas + 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas++;
                                direccion = "abajo";
                            } else {
                                matriz[filas][colum - 1] = "*";
                                matriz[filas][colum] = " ";
                                colum--;
                                direccion = "izquierda";
                            }
                        }
                    }
                    break;
                case "arriba"://ARRIBA
                    if (!matriz[filas][colum - 1].equals("a") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                        matriz[filas][colum - 1] = "*";
                        matriz[filas][colum] = " ";
                        colum--;
                        direccion = "izquierda";
                    } else {
                        if (!matriz[filas - 1][colum].equals("a") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                            matriz[filas - 1][colum] = "*";
                            matriz[filas][colum] = " ";
                            filas--;
                        } else {
                            if (!matriz[filas][colum + 1].equals("a") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                                matriz[filas][colum + 1] = "*";
                                matriz[filas][colum] = " ";
                                colum++;
                                direccion = "derecha";
                            } else {
                                matriz[filas + 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas++;
                                direccion = "abajo";
                            }
                        }
                    }
                    break;
                case "izquierda":
                    if (!matriz[filas + 1][colum].equals("a") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                        matriz[filas + 1][colum] = "*";
                        matriz[filas][colum] = " ";
                        filas++;
                        direccion = "abajo";
                    } else {
                        if (!matriz[filas][colum - 1].equals("a") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                            matriz[filas][colum - 1] = "*";
                            matriz[filas][colum] = " ";
                            colum--;
                        } else {
                            if (!matriz[filas - 1][colum].equals("a") && !matriz[filas - 1][colum].equals("|") && !matriz[filas-1][colum].equals("-")) {
                                matriz[filas - 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas--;
                                direccion = "arriba";
                            } else {
                                matriz[filas][colum + 1] = "*";
                                matriz[filas][colum] = " ";
                                colum++;
                                direccion = "derecha";
                            }
                        }
                    }
                    break;

                case "abajo"://ARRIBA
                    if (!matriz[filas][colum + 1].equals("a") && !matriz[filas][colum + 1].equals("|") && !matriz[filas][colum + 1].equals("-")) {
                        matriz[filas][colum + 1] = "*";
                        matriz[filas][colum] = " ";
                        colum++;
                        direccion = "derecha";
                    } else {
                        if (!matriz[filas + 1][colum].equals("a") && !matriz[filas + 1][colum].equals("|") && !matriz[filas+1][colum].equals("-")) {
                            matriz[filas + 1][colum] = "*";
                            matriz[filas][colum] = " ";
                            filas++;
                        } else {
                            if (!matriz[filas][colum - 1].equals("a") && !matriz[filas][colum - 1].equals("|") && !matriz[filas][colum - 1].equals("-")) {
                                matriz[filas][colum - 1] = "*";
                                matriz[filas][colum] = " ";
                                colum--;
                                direccion = "izquierda";
                            } else {
                                matriz[filas - 1][colum] = "*";
                                matriz[filas][colum] = " ";
                                filas--;
                                direccion = "arriba";
                            }
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            try {
                Thread.sleep(250);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            } 
        }
        imprimirMatriz(matriz);
        System.out.println("Ha llegado a la salida");
    }
}
