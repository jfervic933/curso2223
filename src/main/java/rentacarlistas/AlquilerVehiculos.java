/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentacarlistas;

import arrayss.*;
import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class AlquilerVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        cv.anadirElemento(new Vehiculo());
        cv.anadirElemento(new Vehiculo());
        cv.anadirElemento(new Vehiculo());
        
        System.out.println(cv.toString());
        
//        CatalogoClientes cc = new CatalogoClientes(5);
//        Cliente c = cc.buscarCliente("3");
//        Vehiculo v = cv.buscarVehiculo("4");
//        System.out.println(c);
//        System.out.println(v);
//        Alquiler a = new Alquiler(c, v, LocalDate.now(), 8);
//        System.out.println(a);
//        CatalogoAlquileres ca = new CatalogoAlquileres(10);
//        ca.anadirAlquiler(a);
//        System.out.println("Lista de alquileres");
//        System.out.println(ca);
        
    }
    
}
