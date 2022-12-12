/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

/**
 *
 * @author profesor
 */
// crea la clase heredando de la clase Catalogo (extends)
public class CatalogoVehiculos extends Catalogo<Vehiculo> {
    
    public CatalogoVehiculos(int tamanio) {
        super(tamanio); // LLama al constructor de la clase padre
    }
    
    public Vehiculo buscarVehiculo(String bastidor) {
        // 
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}
