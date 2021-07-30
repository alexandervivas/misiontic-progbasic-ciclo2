/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author alexandervivas
 */
public class E4 {
    
    public static void main(String[] arrgs) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        
        int [] vector = ordenamientoPersonalizado(vectorEntrada);
        
        imprimir(vector);
    }
    
    /**
     * La primera mitad de los valores deben estar ordenados ascendentemente
     * La segunda mitad de los valores deben estar ordenados descendentemente
     * @param vector
     * @return vectorOrdenado de acuerdo a los criterios anteriores
     */
    public static int [] ordenamientoPersonalizado(int [] vector){
        
        int [] vectorOrdenado = new int[vector.length];
        
        // indices para ordenamiento ascendente: 0 hasta la mitad - 1
        // vector 10 posiciones, [0, 5 - 1]
        
        // indices para ordenamiento descendente: la mitad hasta el final - 1
        // vector 10 posiciones, [5, 10 - 1]
        
        // Arrays.copyOfRange: copiar un vector usando indices (desde, hasta)
        // Arrays.copyOfRange(vector, 0, 10): copie el vector desde la posicion 0 hasta la posicion 10
        int [] vectorOrdenadoAscendentemente = ordenamientoAscendente(Arrays.copyOfRange(vector, 0, (vector.length / 2)));
        int [] vectorOrdenadoDescendentemente = ordenamientoDescendente(Arrays.copyOfRange(vector, (vector.length / 2), vector.length));
        
        /*for(int i = 0; i < (vector.length / 2); i++) {
            // i = 4, vector.length = 10
            // vectorOrdenado[4] = vectorOrdenadoAscendentemente[4]
            // vectorOrdenado[9] = vectorOrdenadoDescendentemente[4]
            // vectorOrdenado[0 -> 4]: ascendemente
            // vectorOrdenado[5 -> 9]: descendentemente
            
            vectorOrdenado[i] = vectorOrdenadoAscendentemente[i];
            vectorOrdenado[i + (vector.length / 2)] = vectorOrdenadoDescendentemente[i];
        }*/
        
        System.arraycopy(vectorOrdenadoAscendentemente, 0, vectorOrdenado, 0, vectorOrdenadoAscendentemente.length);
        System.arraycopy(vectorOrdenadoDescendentemente, 0, vectorOrdenado, vector.length / 2, vectorOrdenadoDescendentemente.length);
        
        return vectorOrdenado;
    }
    
    /**
     * Bubble sort garantiza que en cada pasada el ultimo elemento queda ordenado
     * por eso solo en cada iteracion se debe comparar desde la primera posicion hasta
     * la ultima posicion ordenada
     */
    public static int [] ordenamientoAscendente(int [] vector) {
        // bubble sort u ordenamiento burbuja
        // i = 0: 0, 2, 1, 65, 66
        // i = 1: 0, 2, 1, 65, 66 -> 0, 1, 2, 65, 66
        // 0, 1, 2, 65, 66
        // 0, 1, 2, 65, 66
        // 0, 1, 2, 65, 66
        // i: posicion de la burbuja
        // j: posicion de comparacion
        int n = vector.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vector[j] > vector[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
        return vector;
    }
    
    public static int [] ordenamientoDescendente(int [] vector) {
        // bubble sort u ordenamiento burbuja
        // 78, 12, 11, 90, 13 -> 90, 12, 11, 78, 13
        // 90, 12, 11, 78, 13 -> 90, 78, 11, 12, 13 -> 90, 78, 11, 13, 12
        // 90, 78, 11, 13, 12 -> 90, 78, 13, 11, 12 -> 90, 78, 13, 12, 11
        // 90, 78, 13, 12, 11
        // 90, 78, 13, 12, 11
        int n = vector.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vector[j] < vector[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
        return vector;
    }
    
    public static void imprimir(int[] vector) {
        System.out.print("[");
        for(int i = 0; i < vector.length - 1; i++){
            System.out.print(String.valueOf(vector[i]) + ", ");            
        }
        System.out.print(String.valueOf(vector[vector.length - 1]) + "]");
    }
    
}
