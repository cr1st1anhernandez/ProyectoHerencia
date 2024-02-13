public class Persona {
    private static int idCounter = 0;
    private char genero;
    private int id;
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad, char genero) {
        this.id = ++idCounter;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
  
    public int getEdad() {
        return edad;
    }

    public char getGenero() {
      return genero;
    }

    public void setGenero(char genero) {
      this.genero = genero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
