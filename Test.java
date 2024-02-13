import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {

    ArrayList<Persona> personas = new ArrayList<Persona>();

    Persona p = new Persona("Juan", 25, 'M');
    Persona p2 = new Persona("Juan2", 25, 'M');
    Alumno a = new Alumno("Pedro", 20, 'M' , "pedro@mail.com", 1);
    Alumno a2 = new Alumno("Pedro", 20, 'F' , "pedro2@mail.com", 1);
    Docente d = new Docente("Maria", 30, 'F' , 1234567890, "1234567890");
    Docente d2 = new Docente("Maria", 30, 'M' , 1234567890, "1234567890");

    personas.add(p);
    personas.add(p2);
    personas.add(a);
    personas.add(a2);
    personas.add(d);
    personas.add(d2);

    for (Persona persona : personas) {
      System.out.println(persona);
    }
  }
}
