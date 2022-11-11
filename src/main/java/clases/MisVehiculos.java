/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class MisVehiculos {
    
    public static void main(String[] args) {
        // Instancia de la clase Scanner, llamada teclado
        Scanner teclado = new Scanner(System.in);
        // Instancia de la clase Vehiculo, llamada v1
        Vehiculo v1 = new Vehiculo();
        v1.setMatricula("1234RRR");
        v1.setColor("verde");
        
        System.out.println("Matrícula de v1 " + v1.getMatricula());
        System.out.println("Modelo de v1 " + v1.getModelo());
        Vehiculo ferrari = new Vehiculo();
     
        ferrari.setColor("Rosa chicle");
        ferrari.setModelo("testarrosa");
        ferrari.setMarca("Ferrari");
        System.out.println("Color del ferrari " + ferrari.getColor());
        
        // Instanciamos una variable de tipo Vehiculo
        // con los datos que se pasan como parámetro
        Vehiculo mercedes = new Vehiculo("1111AAA", "123454321", 
                "Mercedes", "A1", "Negro", 23.5, true);
        mercedes.setDisponible(false);
        
        System.out.println("Mercedes tarifa: " + mercedes.getTarifa());
        //Vehiculo jeep = new Vehiculo("243RTT", "Gris", "sdafsaf");
//        System.out.println("Jeep marca " + jeep.getMarca());
//        System.out.println("Jeep marca " + jeep.getMatricula());
//        jeep.setMatricula("0000ZZZ");
//        System.out.println("Jeep marca " + jeep.getMatricula());
             
        System.out.println(mercedes);
        System.out.println(v1);
        
        
                
                }
    
}
