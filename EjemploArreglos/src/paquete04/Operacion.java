/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
        
        /* Aqui esta funcion recibe la matriz bidimensional ed los pedidos y saca 
        el promedio semanal de cada cafeteria almacenandolo en un arreglo unidimensional
        y devolviendo este mismo arreglo.
        */
    }

    public static int obtenerSumaTotal(int[][] pedidos) {

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
        /*
        Aqui es una funcion que recibe la matriz bidimensional y suma todos los
        valores para obetener la cantidad total de pedidos de todas las cafeterias 
        durante toda la semana devolviendo una variable entera.
        */
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
        /* 
        Aqui se hace una funcion donde recibe la matriz bidimensional donde suma
        todos los pedidos de cada cafeteria y las almacena en un arreglo 
        unidimensional y lo retorna.
        */
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
        /*
        Aqui recibe el arreglo de los pedidos por cafeteria compara hasta encont
        rar el menor de cada uno y lo almacena y retorna en un arreglo.
        */
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
        
        /*
        Aqui recibe el arreglo de los pedidos por cafeteria y compara hasta enc
        ontrar el mayor de cada uno y lo almacena y retorna en un arreglo.
        */
    }

}

