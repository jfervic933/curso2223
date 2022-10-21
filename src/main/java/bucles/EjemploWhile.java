/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class EjemploWhile {
    
    // BUCLE WHILE EJECUTA SUS SENTENCIAS ENTRE 0 Y N VECES
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número (100 - 200): ");
        
        int num = teclado.nextInt(); // Inicialización de variable de control
        while(num<100 || num>200){
            System.out.println("Te has equivocado, por favor , introduce de nuevo:");
            num = teclado.nextInt();
        }
        
        
        // Volver a pedir al usuario el número si no está entre 100 y 200
        // Inicialización de la variable de control
        int numero = 0;
        
        // Condición del bucle
        // Mientras la condición del bucle sea true se repite el código entre { }
        // Imprimir del 0 al 10
        while(numero<=10){
            System.out.println(numero);
            // SIEMPRE. DENTRO DEL BUCLE, hay que actualizar la variable de control
            numero++;
        }
        System.out.println("El bucle ha terminado");
        System.out.println("------------------------"
                + "");
        // Del 20 al 0
        // Inicialización
        numero = 20;
        // Condición
        while (numero>=0){
            System.out.println(numero);
            numero--; // Actualización
        }
        System.out.println("-----------------------");
        // Del 50 al 70 de tres en tres
        numero = 50;
        while (numero<=70){
            System.out.println(numero);
            numero+=3;
        }
        
        
        
    }
    
}
