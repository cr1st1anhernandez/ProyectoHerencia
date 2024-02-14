import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Operaciones {

  private ArrayList<Persona> personas = new ArrayList<Persona>();

  public void agregar(Persona persona) {
    personas.add(persona);
  }

  public void eliminar(Persona persona) {
    personas.remove(persona);
  }

  public void eliminar(int index) {
    personas.remove(index);
  }

  public void crearArchivo(String nombreArchivo) {
    try {
      PrintWriter archivoEscrito = new PrintWriter(new FileWriter(nombreArchivo));
      for (Persona persona : personas) {
        archivoEscrito.println(persona);
      }
      archivoEscrito.close();
    } catch (Exception e) {
      System.out.println("Error al crear el archivo");
    }
  }

  public void guardar() {
    try {
      PrintWriter archivoAlumnos = new PrintWriter(new FileWriter("alumnos.txt"));
      PrintWriter archivoDocentes = new PrintWriter(new FileWriter("docentes.txt"));
      for (Persona persona : personas) {
        if(persona instanceof Alumno) {
          archivoAlumnos.println(persona);
        } else if(persona instanceof Docente) {
          archivoDocentes.println(persona);
        }
      }
      archivoAlumnos.close();
      archivoDocentes.close();
    } catch (Exception e) {
      System.out.println("Error al crear el archivo");
    }
  }

}
