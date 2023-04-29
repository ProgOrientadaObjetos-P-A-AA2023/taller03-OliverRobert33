
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
        
        // Creacion del 1 objeto
        EquivalenteHora hora = new EquivalenteHora();
        
        // Creacion del 2 objeto
        EquivalenteHora calcular = new EquivalenteHora();
        
        int horaIngresada = 50;
//        System.out.println("Ingrese la hora: ");
//        horaIngresada = entrada.nextInt();
        
        hora.establecerHora(horaIngresada);
        calcular.calcularMinutos(horaIngresada);
        calcular.calcularSegundos(horaIngresada);
        calcular.calcularDias(horaIngresada);
        
        System.out.printf(""
                + "La hora ingresada es: %d\n"
                + "*Minutos: %d minutos\n"
                + "*Segundos: %d segundos\n"
                + "*Dias: %d dias\n"
                , hora.obtenerHora()
                ,calcular.obtenerMinutos()
                , calcular.obtenerSegundos()
                ,calcular.obtenerDias()
        );
        
        
        
        

    }
}
