/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;

import javax.swing.JOptionPane;

/**
 *
 * @author profesor
 */
public class Calculadora {

    public static void main(String[] args) {
        double resultado = 0;

        double operando1 = Double.parseDouble(JOptionPane.
                showInputDialog("Introducuce operando 1"));
        double operando2 = Double.parseDouble(JOptionPane.
                showInputDialog("Introducuce operando 2"));

        String menu = """
                      -----------------------------
                                CALCULADORA
                      -----------------------------
                        1.- SUMAR
                        2.- RESTAR
                        3.- MULTIPLICAR
                        4.- DIVIDIR
                      """;

        String opcion = JOptionPane.showInputDialog(menu);

//        // Lógica de la aplicación
//        // Si es opción 1 --> sumar
//        if (opcion.equals("1")){
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//        }
//        // Si es opcion 2 --> restar
//        if (opcion.equals("2")){
//            resultado = operando1 - operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//        }
//        
//        // Si es opcion 3 --> multiplicar
//        if (opcion.equals("3")){
//            resultado = operando1 * operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//        }
//        
//        // Si es opcion 4 --> dividir
//        if (opcion.equals("4")){
//            resultado = operando1 / operando2;
//            System.out.printf("El resultado es %.2f", resultado);
//        }
        // Lógica de la aplicación
        // Si es opción 1 --> sumar
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else {
            // Si es opcion 2 --> restar
            if (opcion.equals("2")) {
                resultado = operando1 - operando2;
                System.out.printf("El resultado es %.2f", resultado);
            } else {
                // Si es opcion 3 --> multiplicar
                if (opcion.equals("3")) {
                    resultado = operando1 * operando2;
                    System.out.printf("El resultado es %.2f", resultado);
                } else {
                    // Si es opcion 4 --> dividir
                    if (opcion.equals("4")) {
                        resultado = operando1 / operando2;
                        System.out.printf("El resultado es %.2f", resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    }
                }

            }

        }

        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("2")) {
            // Si es opcion 2 --> restar
            resultado = operando1 - operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("3")) {
            // Si es opcion 3 --> multiplicar
            resultado = operando1 * operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else if (opcion.equals("4")) {
            // Si es opcion 4 --> dividir
            resultado = operando1 / operando2;
            System.out.printf("El resultado es %.2f", resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }
    }
}




