/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;

import com.sun.source.tree.SwitchTree;
import javax.swing.JOptionPane;

/**
 *
 * @author profesor
 */
public class Dulces {

    public static void main(String[] args) {

        // Costes mano obra
        final double MANO_OBRA_M1_T1 = 0.15;
        final double MANO_OBRA_M2_T2_P1 = 0.22;

        // Margen de beneficio por unidad
        final double BENEFICIO_M1_M2_P1 = 0.5;  // 50%
        final double BENEFICIO_T1_T2 = 0.65;     // 65%

        // Beneficio final
        final double BENEFICIO_VENTAS = 2500;

        // Rango precio materia prima
        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;

        // Variables
        double precioMateriaPrima = 0;
        double costeProduccion = 0;
        double precioVentaU = 0;
        int unidadesParaBeneficio = 0;
        // Entradas 
        // Código del dulce
        // Precio materia prima para producir una unidad
        String codigoProducto = JOptionPane.
                showInputDialog("Introduce el código: ");
        codigoProducto = codigoProducto.toUpperCase();

        // Si el ćodigo es válido
        if (codigoProducto.equals("M1") || codigoProducto.equals("M2")
                || codigoProducto.equals("T1") || codigoProducto.equals("T2")
                || codigoProducto.equals("P1")) {
            // Código del algoritmo
            precioMateriaPrima = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce precio materia prima"));
            System.out.println("El precio es " + precioMateriaPrima);

            // Si el precio no está entre 0.1 y 1 terminar
            if (precioMateriaPrima >= LIMITE_INFERIOR
                    && precioMateriaPrima <= LIMITE_SUPERIOR) {

//                 Si el codigo es m1 o t1 mano obra 0.15
//             Resto 0.22
//                if (codigoProducto.equals("M1") || codigoProducto.equals("T1")) {
//                    costeProduccion = precioMateriaPrima + MANO_OBRA_M1_T1;
//                } else {
//                    costeProduccion = precioMateriaPrima + MANO_OBRA_M2_T2_P1;
//                }
//                manoObra = switch(codigoProducto){
//                    case "T1", "M1" -> MANO_OBRA_M1_T1;
//                    default -> MANO_OBRA_M2_T2_P1;
//                };

                // Cálculo coste de producción
                double manoObra = ((codigoProducto.equals("M1")
                        || codigoProducto.equals("T1"))) ? MANO_OBRA_M1_T1 : MANO_OBRA_M2_T2_P1;
                
                costeProduccion = precioMateriaPrima + manoObra;
                System.out.println("El coste de producción es " + costeProduccion);
                
                // Cálculo del precio venta unitario
                double beneficio = ((codigoProducto.equals("T2")
                        || codigoProducto.equals("T1"))) ? BENEFICIO_T1_T2 : BENEFICIO_M1_M2_P1;
                
                precioVentaU = costeProduccion + (beneficio *  costeProduccion);
                System.out.println("El precio venta es " + precioVentaU);
                
                beneficio = precioVentaU - costeProduccion;
                unidadesParaBeneficio = (int) Math.ceil(BENEFICIO_VENTAS / beneficio);
                
                System.out.println("Unidades necesarias " + unidadesParaBeneficio);
                
            } else {
                JOptionPane.showMessageDialog(null, "Precio no válido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Código incorrecto");
        }

        // La siguiente estructura es equivalente al if else anterior
//        switch (codigoProducto) {
//            case "M1", "M2", "T1", "T2", "P1" -> {
//            }
//            default -> JOptionPane.showMessageDialog(null,"Código incorrecto");
//        }
        // Código del algoritmo
        // Algoritmo
        // Salidas
        // Coste producción unitario
        // Precio venta unitario
        // Número de unidades a producir para que beneficio sea 2500
    }

}
