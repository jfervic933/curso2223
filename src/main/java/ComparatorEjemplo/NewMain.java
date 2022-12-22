package ComparatorEjemplo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author profesor
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Ordenador> lista = new ArrayList<>();
        
        lista.add(new Ordenador("1", "Intel", 200, 32));
        lista.add(new Ordenador("4", "AMD", 100, 16));
        lista.add(new Ordenador("3", "SnapDragon", 50, 64));
        
        System.out.println("Lista original --------------");
        lista.forEach(System.out::println);
        
        System.out.println("Ordenación por ID -------------");
        Collections.sort(lista, (o1,o2)-> o1.id().compareTo(o2.id()));
        lista.forEach(System.out::println);
        
        System.out.println("Ordenación por RAM -------------");
        Collections.sort(lista, (o1,o2)-> o1.cantidadRAM() - o2.cantidadRAM());
        lista.forEach(System.out::println);
        
        System.out.println("Búsqueda binaria por memoria RAM");
        Ordenador aux = new Ordenador("", "",0,16);
        int pos = Collections.binarySearch(lista, aux, (o1,o2)-> o1.cantidadRAM() - o2.cantidadRAM());
        System.out.println("El ordenador de 16 MB de RAM está en  " + pos);
    }
    
}
