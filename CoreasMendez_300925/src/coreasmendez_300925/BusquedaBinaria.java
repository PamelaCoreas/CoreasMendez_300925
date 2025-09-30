/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreasmendez_300925;

/**
 *
 * @author Pamela Coreas
 */
public class BusquedaBinaria {
    
    // Método para búsqueda binaria en un arreglo unidimensional
    public int buscarEnArreglo(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (arreglo[medio] == valorBuscado) {
                return medio; // posición encontrada
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1; // no encontrado
    }
    
    // Método para búsqueda binaria en una matriz bidimensional
    public int[] buscarEnMatriz(int[][] matriz, int valorBuscado) {
        for (int i = 0; i < matriz.length; i++) {
            int inicio = 0;
            int fin = matriz[i].length - 1;
            
            while (inicio <= fin) {
                int medio = (inicio + fin) / 2;
                
                if (matriz[i][medio] == valorBuscado) {
                    return new int[]{i, medio}; // posición encontrada (fila, columna)
                } else if (matriz[i][medio] < valorBuscado) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
        }
        
        return new int[]{-1, -1}; // no encontrado
    }
}

