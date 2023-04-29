package paquete2;

/**
 *
 * @author oliver
 */
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    public void establecerHora(int h) {
        horas = h;
    }

    public void calcularMinutos(int h) {
        minutos = h * 60;
    }

    public void calcularSegundos(int h) {
        segundos = h * 3600;
    }

    public void calcularDias(int h) {
        dias = h / 24;
    }

    public int obtenerHora() {
        return horas;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }

    public int obtenerDias() {
        return dias;
    }
}
