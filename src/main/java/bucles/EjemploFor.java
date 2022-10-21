/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author profesor
 */
public class EjemploFor {
    
    public static void main(String[] args) {
        
        // Imprimir del 0 al 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------");
        // Del 0 al 20 de dos en dos
        for (int i = 0; i <= 20; i+=2) {
             System.out.println(i);
        }
        System.out.println("-------------");
        // De 20 a 0
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
}
