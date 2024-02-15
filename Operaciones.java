import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

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

  public void guardar() {
    try {
      BufferedWriter archivoAlumnos = new BufferedWriter(new FileWriter("alumnos.txt", true));
      BufferedWriter archivoDocentes = new BufferedWriter(new FileWriter("docentes.txt", true));
      for (Persona persona : personas) {
        if (persona instanceof Alumno) {
          archivoAlumnos.write(persona.toString() + "\n");
        } else if (persona instanceof Docente) {
          archivoDocentes.write(persona.toString() + "\n");
        }
      }
      archivoAlumnos.flush();
      archivoDocentes.flush();
      archivoAlumnos.close();
      archivoDocentes.close();

      System.out.println("Datos guardados con éxito");
    } catch (Exception e) {
      System.out.println("Error al guardar datos: " + e.getMessage());
    }
  }

  public void guardarPersonas() {
    try {
      BufferedWriter archivoPersonas = new BufferedWriter(new FileWriter("personas.txt", true));
      for (Persona persona : personas) {
        archivoPersonas.write(persona.toString() + "\n");
      }
      archivoPersonas.flush();
      archivoPersonas.close();
      System.out.println("Datos guardados con éxito");
    } catch (Exception e) {
      System.out.println("Error al guardar datos: " + e.getMessage());
    }
  }

  public void generarEstadistica(){
    int hombres = 0;
    int mujeres = 0;
    int mayores = 0;
    int menores = 0;
    try {
      File archivo = new File("personas.txt");
      if (archivo.exists()) {
        java.util.Scanner scanner = new java.util.Scanner(archivo);
        while (scanner.hasNextLine()) {
          String[] datos = scanner.nextLine().split(",");
          char genero = datos[4].charAt(0);
          int edad = Integer.parseInt(datos[3]);
          if (genero == 'M') {
            hombres++;
          } else if (genero == 'F') {
            mujeres++;
          }
          if (edad >= 18) {
            mayores++;
          } else {
            menores++;
          }
        }
        scanner.close();
      }
      System.out.println("Hombres: " + hombres);
      System.out.println("Mujeres: " + mujeres);
      System.out.println("Mayores de edad: " + mayores);
      System.out.println("Menores de edad: " + menores);
    } catch (Exception e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
  }
}
