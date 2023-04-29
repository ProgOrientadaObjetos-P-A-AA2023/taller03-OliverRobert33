
package paquete2;

/**
 *
 * @author oliver
 */
public class Instituciones {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadoEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipoInstitucion(String t) {
        tipoInstitucion = t;
    }

    public void establecerNumeroAlumnos(int n) {
        numeroAlumnos = n;
    }

    public void establecerNumeroDocentes(int n) {
        numeroDocentes = n;
    }

    public void establecerNumeroSedes(int n) {
        numeroSedes = n;
    }

    public void establecerGastosProyectadoEstudiante(double g) {
        gastosProyectadoEstudiante = g;
    }
    
    public void calcularPresupuesto(int d, double e) {
        presupuesto = d * e;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public double obtenerGastosProyectadoEstudiante() {
        return gastosProyectadoEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
