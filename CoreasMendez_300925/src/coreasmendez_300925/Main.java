/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coreasmendez_300925;

/**
 *
 * @author Pamela Coreas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Instancia de la clase BusquedaBinaria (puntero/referencia en Java)
        BusquedaBinaria buscar = new BusquedaBinaria();
        
        // ========= PRUEBA CON ARREGLO =========
        int[] arreglo = {17, 19, 21, 23, 25, 27, 29, 31};
        int valorArreglo = 23;
        
        int pos = buscar.buscarEnArreglo(arreglo, valorArreglo);
        
        if (pos != -1) {
            System.out.println("El valor " + valorArreglo + " está en la posición " + pos);
        } else {
            System.out.println("El valor " + valorArreglo + " no se encontró en el arreglo");
        }
        
        // ========= PRUEBA CON MATRIZ =========
        int[][] matriz = {
            {1, 3, 5, 7},
            {9, 11, 13, 15},
            {17, 19, 21, 23},
            {25, 27, 29, 31}
        };
        int valorMatriz = 19;
        
        int[] posicion = buscar.buscarEnMatriz(matriz, valorMatriz);
        
        if (posicion[0] != -1) {
            System.out.println("El valor " + valorMatriz + " está en la fila " + posicion[0] + ", columna " + posicion[1]);
        } else {
            System.out.println("El valor " + valorMatriz + " no se encontró en la matriz");
        } 
    }
    
}
