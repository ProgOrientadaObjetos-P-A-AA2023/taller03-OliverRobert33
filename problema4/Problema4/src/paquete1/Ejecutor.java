package paquete1;

import paquete2.DispositivosMoviles;

/**
 * @author oliver
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Objetos
        DispositivosMoviles celular = new DispositivosMoviles();
        DispositivosMoviles calcular = new DispositivosMoviles();

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

        calcular.calcularIvaCostoFinal(ivaPorcentaje, costoInicial);
        calcular.calcularCostoFinal(costoInicial);

        System.out.printf(""
                + "Las caracteristicas dek telefono son:\n"
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
                 calcular.obtenerIvaCostoFinal(),
                 calcular.obtenerCostoFinal());

    }

}
