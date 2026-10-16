/**
 * Sistema de Gestión de Estudiantes.
 * Ejemplo de clases, objetos, atributos,
 * constructor y métodos en Java.
 */

// Clase que representa a un estudiante.
class Estudiante {

    // Atributos del estudiante.
    String nombre;
    int edad;
    double calificacion;

    // Constructor para inicializar sus datos.
    public Estudiante(String nombre, int edad,
                      double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para mostrar los datos.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println(
            "Calificacion: " + calificacion
        );
    }

    // Método para saber si aprobó.
    public void verificarCalificacion() {
        if (calificacion >= 70) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: No aprobado");
        }
    }
}

// Clase principal del programa.
public class Main {

    public static void main(String[] args) {

        // Crear un objeto de la clase Estudiante.
        Estudiante alumno1 =
            new Estudiante("Lucero", 18, 95);

        // Utilizar los métodos del objeto.
        alumno1.mostrarDatos();
        alumno1.verificarCalificacion();
    }
}