package paquete2;

/**
 * @author oliver
 */
public class DispositivosMoviles {

    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private String direccionMac;
    private String informacionIMEI;
    private double ivaCostoFinal;
    private double costoFinal;

    public void establecerSistemaOperativo(String s) {
        sistemaOperativo = s;
    }

    public void establecerTamanoPantalla(double t) {
        tamanoPantalla = t;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerIvaPorcentaje(double i) {
        ivaPorcentaje = i;
    }

    public void establecerDireccionMac(String d) {
        direccionMac = d;
    }

    public void establecerInformacionIMEI(String i) {
        informacionIMEI = i;
    }

    public void calcularIvaCostoFinal(double i, double c) {
        ivaCostoFinal = (i / 100) * c;
    }

    public void calcularCostoFinal(double c) {
        costoFinal = c + ivaCostoFinal;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

    public String obtenerInformacionIMEI() {
        return informacionIMEI;
    }

    public double obtenerIvaCostoFinal() {
        return ivaCostoFinal;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

}
