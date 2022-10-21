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
public class EjemploDoWhile {
    // EL BUCLE DO WHILE SIEMPRE HACE AL MENOS
    // UNA ITERACIÓN
    // BUCLE DO WHILE EJECUTA ENTRE 1 Y N
    public static void main(String[] args) {
        
        // Imprimir del 0 al 10
        int numero = 0;
        do {
            System.out.println(numero);  
            numero++;
        } while (numero<=-10);
        
        System.out.println("Sale del bucle");
        System.out.println("-------------------------");
        numero=10;
        do{
            System.out.println(numero);
            numero--;
        } while(numero>=0);
        
        Scanner teclado = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Introduce un número (100 - 200): ");
            valor = teclado.nextInt();
        } while (valor<100 || valor>200);
        
        
        
    }
    
}
