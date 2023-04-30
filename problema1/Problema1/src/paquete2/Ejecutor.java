package paquete2;

import paquete1.Terreno;

/**
 *
 * @author OLIVER SARAGURO
 *
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Objeto 1
        Terreno terreno = new Terreno();
        double ancho = 50.5;
        double largo = 100.5;
        double valorMetroCuadrado = 150.5;
        
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno.calcularArea(ancho, largo);
        terreno.calcularCostoTerreno(valorMetroCuadrado);

        System.out.printf(
                "El terreno 1 cuyas caracteristicas son:\n\n"
                + "*Ancho: %.1f m\n"
                + "*Largo: %.1f m\n"
                + "*Area: %.2f m²\n"
                + "*Valor Metro Cuadrado: $ %.2f\n"
                + "*Costo Terreno: $ %.2f\n",
                terreno.obtenerAncho(),
                terreno.obtenerLargo(),
                terreno.obtenerArea(),
                terreno.obtenerValorMetroCuadrado(),
                terreno.obtenerCostoTerreno());

        // Objeto 2
        Terreno terreno2 = new Terreno();
        double ancho2 = 60.5;
        double largo2 = 120.5;
        double valorMetroCuadrado2 = 200.5;

        terreno2.establecerAncho(ancho2);
        terreno2.establecerLargo(largo2);
        terreno2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        terreno2.calcularArea(ancho2, largo2);
        terreno2.calcularCostoTerreno(valorMetroCuadrado2);

        System.out.println("------------------------------------------------");
        System.out.printf(
                "El terreno 2 cuyas caracteristicas son:\n\n"
                + "*Ancho: %.1f m\n"
                + "*Largo: %.1f m\n"
                + "*Area: %.2f m²\n"
                + "*Valor Metro Cuadrado: $ %.2f\n"
                + "*Costo Terreno: $ %.2f\n",
                terreno2.obtenerAncho(),
                terreno2.obtenerLargo(),
                terreno2.obtenerArea(),
                terreno2.obtenerValorMetroCuadrado(),
                terreno2.obtenerCostoTerreno());
    }
}
