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

    public int mayorValor(int arr[], int i, int j) {
        if (arr.length == 1) {
            return arr[i];
        }
        
    }
}
