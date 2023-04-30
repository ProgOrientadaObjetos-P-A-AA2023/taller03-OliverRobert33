package paquete1;

import paquete2.Instituciones;

/**
 *
 * @author oliver
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Objeto 1
        Instituciones institucion = new Instituciones();
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
        institucion.calcularPresupuesto(numeroAlumnos, gastosProyectadoEstudiante);

        System.out.printf(""
                + "*Nombre Institucion: %s\n"
                + "*Tipo de Institucion: %s\n"
                + "*Alumnos: %d\n"
                + "*Docentes: %d\n"
                + "*Sedes: %d\n"
                + "*Presupuesto: %.2f\n",
                 institucion.obtenerNombre(),
                 institucion.obtenerTipoInstitucion(),
                 institucion.obtenerNumeroAlumnos(),
                 institucion.obtenerNumeroDocentes(),
                 institucion.obtenerNumeroSedes(),
                 institucion.obtenerPresupuesto());

        
        // Objeto 2
        Instituciones institucion2 = new Instituciones();
        String nombre2 = "Bilingue";
        String tipoInstitucion2 = "Particular";
        int numeroAlumnos2 = 2000;
        int numeroDocentes2 = 100;
        int numeroSedes2 = 2;
        double gastosProyectadoEstudiante2 = 150;

        institucion2.establecerNombre(nombre2);
        institucion2.establecerTipoInstitucion(tipoInstitucion2);
        institucion2.establecerNumeroAlumnos(numeroAlumnos2);
        institucion2.establecerNumeroDocentes(numeroDocentes2);
        institucion2.establecerNumeroSedes(numeroSedes2);
        institucion2.establecerGastosProyectadoEstudiante(gastosProyectadoEstudiante2);
        institucion2.calcularPresupuesto(numeroAlumnos2, gastosProyectadoEstudiante2);

        System.out.println("--------------------------------------------------");
        System.out.printf(""
                + "*Nombre Institucion: %s\n"
                + "*Tipo de Institucion: %s\n"
                + "*Alumnos: %d\n"
                + "*Docentes: %d\n"
                + "*Sedes: %d\n"
                + "*Presupuesto: %.2f\n",
                 institucion2.obtenerNombre(),
                 institucion2.obtenerTipoInstitucion(),
                 institucion2.obtenerNumeroAlumnos(),
                 institucion2.obtenerNumeroDocentes(),
                 institucion2.obtenerNumeroSedes(),
                 institucion2.obtenerPresupuesto());
    }
}
