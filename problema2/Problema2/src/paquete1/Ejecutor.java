package paquete1;
//import java.util.Scanner;

import paquete2.EquivalenteHora;

/**
 *
 * @author oliver
 */
public class Ejecutor {

    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);

        // Objeto 1
        EquivalenteHora hora = new EquivalenteHora();
        int horaIngresada = 50;
//        System.out.println("Ingrese la hora: ");
//        horaIngresada = entrada.nextInt();

        hora.establecerHora(horaIngresada);
        hora.calcularMinutos(horaIngresada);
        hora.calcularSegundos(horaIngresada);
        hora.calcularDias(horaIngresada);

        System.out.printf(""
                + "La hora ingresada es: %d\n"
                + "*Minutos: %d minutos\n"
                + "*Segundos: %d segundos\n"
                + "*Dias: %d dias\n",
                 hora.obtenerHora(),
                 hora.obtenerMinutos(),
                 hora.obtenerSegundos(),
                 hora.obtenerDias());

        // Objeto 2
        EquivalenteHora hora2 = new EquivalenteHora();
        int horaIngresada2 = 100;

        hora2.establecerHora(horaIngresada2);
        hora2.calcularMinutos(horaIngresada2);
        hora2.calcularSegundos(horaIngresada2);
        hora2.calcularDias(horaIngresada2);
        System.out.println("------------------------------------------------");

        System.out.printf(""
                + "La hora ingresada es: %d\n"
                + "*Minutos: %d minutos\n"
                + "*Segundos: %d segundos\n"
                + "*Dias: %d dias\n",
                 hora2.obtenerHora(),
                 hora2.obtenerMinutos(),
                 hora2.obtenerSegundos(),
                 hora2.obtenerDias());

    }
}
