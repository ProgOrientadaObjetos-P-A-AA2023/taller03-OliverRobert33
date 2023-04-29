package paquete1;

import paquete2.DispositivosMoviles;

/**
 * @author oliver
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Objetos
        DispositivosMoviles celular = new DispositivosMoviles();

        String sistemaOperativo = "iOS";
        double tamanoPantalla = 6.5;
        double costoInicial = 909;
        double ivaPorcentaje = 15;
        String direccionMac = "b342n23YO";
        String informacionIMEI = "2345893000S";

        celular.establecerSistemaOperativo(sistemaOperativo);
        celular.establecerTamanoPantalla(tamanoPantalla);
        celular.establecerCostoInicial(costoInicial);
        celular.establecerIvaPorcentaje(ivaPorcentaje);
        celular.establecerDireccionMac(direccionMac);
        celular.establecerInformacionIMEI(informacionIMEI);

        celular.calcularIvaCostoFinal(ivaPorcentaje, costoInicial);
        celular.calcularCostoFinal(costoInicial);

        System.out.printf(""
                + "Las caracteristicas del telefono son:\n"
                + "-Sistema Operativo: %s\n"
                + "-Tamaño de Pantalla: %.1f pulgadas\n"
                + "-Costo Inicial: $%.2f \n"
                + "-Iva en %%: %.1f %% \n"
                + "-Direccion Mac: %s\n"
                + "-Informacion IMEI: %s\n"
                + "-Iva: $%.2f\n"
                + "-Costo Final: $%.2f\n",
                celular.obtenerSistemaOperativo(),
                celular.obtenerTamanoPantalla(),
                celular.obtenerCostoInicial(),
                celular.obtenerIvaPorcentaje(),
                celular.obtenerDireccionMac(),
                celular.obtenerInformacionIMEI(),
                 celular.obtenerIvaCostoFinal(),
                 celular.obtenerCostoFinal());
        
        DispositivosMoviles celular2 = new DispositivosMoviles();

        String sistemaOperativo2 = "Redmi";
        double tamanoPantalla2 = 5.5;
        double costoInicial2 = 500;
        double ivaPorcentaje2 = 12;
        String direccionMac2 = "t334cn23YO";
        String informacionIMEI2 = "r345890S";

        celular2.establecerSistemaOperativo(sistemaOperativo2);
        celular2.establecerTamanoPantalla(tamanoPantalla2);
        celular2.establecerCostoInicial(costoInicial2);
        celular2.establecerIvaPorcentaje(ivaPorcentaje2);
        celular2.establecerDireccionMac(direccionMac2);
        celular2.establecerInformacionIMEI(informacionIMEI2);
        celular2.calcularIvaCostoFinal(ivaPorcentaje2, costoInicial2);
        celular2.calcularCostoFinal(costoInicial2);

        System.out.println("------------------------------------------------");
        System.out.printf(""
                + "Las caracteristicas del telefono son:\n"
                + "-Sistema Operativo: %s\n"
                + "-Tamaño de Pantalla: %.1f pulgadas\n"
                + "-Costo Inicial: $%.2f \n"
                + "-Iva en %%: %.1f %% \n"
                + "-Direccion Mac: %s\n"
                + "-Informacion IMEI: %s\n"
                + "-Iva: $%.2f\n"
                + "-Costo Final: $%.2f\n",
                celular2.obtenerSistemaOperativo(),
                celular2.obtenerTamanoPantalla(),
                celular2.obtenerCostoInicial(),
                celular2.obtenerIvaPorcentaje(),
                celular2.obtenerDireccionMac(),
                celular2.obtenerInformacionIMEI(),
                 celular2.obtenerIvaCostoFinal(),
                 celular2.obtenerCostoFinal());

    }

}
