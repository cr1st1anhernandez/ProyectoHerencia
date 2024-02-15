public class Alumno extends Persona {
  private String email;
  private int grupo;

  public Alumno(String nombre, int edad, char genero,  String email, int grupo) {
    super(nombre, edad, genero);
    this.email = email;
    this.grupo = grupo;
  }

  @Override
  public String toString() {
    return "Alumno," + getId() + "," + getNombre() + "," + getEdad() + "," + getGenero() + "," + email + "," + grupo;
  }

  public String getEmail() {
    return email;
  }

  public int getGrupo() {
    return grupo;
  }

  public void setGrupo(int grupo) {
    this.grupo = grupo;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
