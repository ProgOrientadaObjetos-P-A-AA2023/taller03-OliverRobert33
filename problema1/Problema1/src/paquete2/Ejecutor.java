
package paquete2;

import com.sun.tools.javac.Main;
import paquete1.Terreno;

/**
 *
 * @author OLIVER SARAGURO

 */
public class Ejecutor {

    public static void main(String[] args) {

        double ancho = 50.5;
        double largo = 100.5;
        double valorMetroCuadrado = 150.5;

        // Creacion del 1 objeto 
        Terreno terreno = new Terreno();
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        // Creacion des 2 objeto
        Terreno calcularTerreno = new Terreno();
        calcularTerreno.calcularArea(ancho, largo);
        calcularTerreno.calcularCostoTerreno(valorMetroCuadrado);

        System.out.printf(
                "El terreno cuyas caracteristicas son:\n\n"
                + "*Ancho: %.1f m\n"
                + "*Largo: %.1f m\n"
                + "*Area: %.2f m²\n"
                + "*Valor Metro Cuadrado: $ %.2f\n"
                + "*Costo Terreno: $ %.2f\n",
                terreno.obtenerAncho(),
                terreno.obtenerLargo(),
                calcularTerreno.obtenerArea(),
                terreno.obtenerValorMetroCuadrado(),
                calcularTerreno.obtenerCostoTerreno());

    }
}
