/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Home
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main obj = new Main();
        int factorial = obj.calcularFactorial(6);
        System.out.println(factorial);
        System.out.println(obj.esPar(5));
        System.out.println(obj.esImpar(3));
        int[] arregloPrueba = {1, 2, 3, 4};
        System.out.println(obj.sumaArreglo(arregloPrueba, 0));
        System.out.println(obj.busquedaBinaria(arregloPrueba, 2, 0, arregloPrueba.length));
        System.out.println(obj.mayorValor(arregloPrueba, arregloPrueba.length));
    }

    /*Función de recursión directa*/
    public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {                       //Caso base
            return 1;
        }
        return numero * calcularFactorial(numero - 1);          //Caso recursivo
    }

    /*Funciones de recursión indirecta*/
    public boolean esPar(int numero) {
        if (numero == 0) {                                      //Caso base
            return true;
        }
        return esImpar(numero - 1);                             //Caso recursivo, llama a la otra función.
    }

    public boolean esImpar(int numero) {
        if (numero == 0) {                                      //Caso base
            return false;
        }
        return esPar(numero - 1);                               //Caso recursivo, llama a la otra función.
    }
    //Prueba en el segundo computador

    public int sumaArreglo(int arr[], int i) {
        if (i == arr.length) {
            return 0;
        } else {
            return arr[i] + sumaArreglo(arr, i + 1);
        }
    }

    /*Función recursiva para buscar el mayor valor de un arreglo*/
    public int mayorValor(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }

        int mayorTemporal = mayorValor(arr, n - 1);

        if (arr[n - 1] > mayorTemporal) {
            return arr[n - 1];
        } else {
            return mayorTemporal;
        }
    }

    /*Función recursiva de búsqueda binaria*/
    public int busquedaBinaria(int arr[], int valorbuscado, int inicio, int fin) {
        int medio = (inicio + fin) / 2;
        if (inicio > fin) {
            return -1;//Error, no encontrado.
        }
        if (arr[medio] == valorbuscado) {
            return medio;
        } else if (arr[medio] < valorbuscado) {
            return busquedaBinaria(arr, valorbuscado, medio + 1, fin);
//Que inicio sea medio + 1.
        }
        return busquedaBinaria(arr, valorbuscado, inicio, medio - 1);
//Que final sea medio - 1. Este caso solo se activa si arr[medio] > valorbuscado.
    }
}
