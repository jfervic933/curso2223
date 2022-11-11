/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * 
¿Qué es una clase?
* Es un molde donde vamos a indicar los atributos y métodos
* de los objetos que queremos modelar
¿Qué es un objeto?
* Es una variable de tipo referencia que contiene los datos concretos de una
* instancia de una clase

¿Cuáles son las partes de una clase?
* Definición, atributos y métodos
¿Qué elementos componen la definición de una clase? Explica brevemente cada uno
¿Qué es un método constructor?
¿Qué son los métodos de consulta o getters?
¿Qué son los métodos modificadores o setters?
¿En qué consiste la instanciación de un objeto? ¿Para qué sirve el operador ‘new’?
¿Cuál es la función del método main()? ¿Cómo se declara el método main()?
¿Cómo interaccionan los objetos de una aplicación?

 */

// Definición de la clase Vehiculo
public class Vehiculo {
    // Atributos
    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa; // Precio alquiler día
    private boolean disponible; // Alquilado o libre
    

    
//    public Vehiculo(String matricula, String color, String bastidor){
//        this.matricula = matricula;
//        this.color = color;
//        this.bastidor = bastidor;
//        // El resto se quedan con valores por defecto: null para objetos,0 para numeros
//        // false boooleanos
//        
//    }

    public Vehiculo(String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public Vehiculo() {
    }

    public Vehiculo(String bastidor, String modelo, double tarifa) {
        this.bastidor = bastidor;
        this.modelo = modelo;
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", bastidor=" + bastidor + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }


}
