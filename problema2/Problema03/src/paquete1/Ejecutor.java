

package paquete1;

import paquete2.Instituciones;

/**
 *
 * @author oliver
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
    Instituciones institucion = new Instituciones();
    Instituciones calcular = new Instituciones();
    
    String nombre = "Unidad Educativa Fiscomisional 'San Juan Bautista'";
    String tipoInstitucion = "Fiscomisional";
    int numeroAlumnos = 4500;
    int numeroDocentes = 250;
    int numeroSedes = 2;
    double gastosProyectadoEstudiante = 70.50;
    
    institucion.establecerNombre(nombre);
    institucion.establecerTipoInstitucion(tipoInstitucion);
    institucion.establecerNumeroAlumnos(numeroAlumnos);
    institucion.establecerNumeroDocentes(numeroDocentes);
    institucion.establecerNumeroSedes(numeroSedes);
    institucion.establecerGastosProyectadoEstudiante(gastosProyectadoEstudiante);
    
    calcular.calcularPresupuesto(numeroAlumnos, gastosProyectadoEstudiante);
    
        System.out.printf(""
                + "*Nombre Institucion: %s\n"
                + "*Tipo de Institucion: %s\n"
                + "*Alumnos: %d\n"
                + "*Docentes: %d\n"
                + "*Sedes: %d\n"
                + "*Presupuesto: %.2f\n"
                , institucion.obtenerNombre()
                ,institucion.obtenerTipoInstitucion()
                , institucion.obtenerNumeroAlumnos()
                , institucion.obtenerNumeroDocentes()
                , institucion.obtenerNumeroSedes()
                , calcular.obtenerPresupuesto());
    }
}
