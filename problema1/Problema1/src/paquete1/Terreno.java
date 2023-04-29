
package paquete1;

import java.awt.geom.Area;

/**
 *
 * @author OLIVER SARAGURO
 */
public class Terreno {

    // Atributos
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    
    // atributos del 2 objeto
    private double area;
    private double costoTerreno;

    public void establecerAncho(double a) {
        ancho = a;
    }

    public void establecerLargo(double l) {
        largo = l;
    }

    public void establecerValorMetroCuadrado(double v) {
        valorMetroCuadrado = v;
    }

    public void calcularArea(double l, double a){
        area = l * a;
    }

    public void calcularCostoTerreno(double v) {
        costoTerreno = v * area;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno() {
        return costoTerreno;
    }

}
