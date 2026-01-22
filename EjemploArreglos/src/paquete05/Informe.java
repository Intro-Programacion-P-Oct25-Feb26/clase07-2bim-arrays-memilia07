/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(int [][] pedidos, int dia){
        
        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia-1];
        }
        return suma;
        /*
        Aqui la funcion recibe la matriz bidimensional de los pedidos y la varia
        ble dia que tiene valor 3 por el dia miercoles.
        */
    }
    
    public static String obtenerCafeteriaMasPedidos(int [][] pedidos, String[] cafeterias){
        
        int [] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias[indice];
        /*
        Recibe la matriz bidimensional de pedidos y una matriz unidimensional
        de los nombres luego crea un arreglo y llama una funcion donde se envian 
        los pedidos y los va comparando en el ciclo for y retorna el valor en 
        la posicion resultante.
        
        */
        
    }
    
    public static int [] obtenerMenorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMenores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }
        
        return pedidosMenores;
    /*
    Aqui recibe la matriz pedidos luego crea un arreglo unidimensional y llama
        a una funcion para almacenar en dicho arreglo la menos cantidad de pe
        didos de cada cafeteria.
        
    */
    }
    
    public static int [] obtenerMayorPedidoCafeteria(int [][] pedidos){
        int [] pedidosMayores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }
        
        return pedidosMayores;
    }
    /*
    Recibe la matriz bidimensional de pedidos y crea un arreglo unidimensional 
    y llama una funcion para almacenar en dicho arreglo la mayor cantidad de 
    pedidos de cada cafeteria.
    */
    
    
    
}
