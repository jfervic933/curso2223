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
public class CalculadoraSwitch {

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

        switch (opcion) {
            case "1", "9", "12":
            case "10":
            case "21":
                resultado = operando1 + operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "2":
                // Si es opcion 2 --> restar
                resultado = operando1 - operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "3":
                // Si es opcion 3 --> multiplicar
                resultado = operando1 * operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            case "4":
                // Si es opcion 4 --> dividir
                resultado = operando1 / operando2;
                System.out.printf("El resultado es %.2f", resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                break;
        }
    }
}




