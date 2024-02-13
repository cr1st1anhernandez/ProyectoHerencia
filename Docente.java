public class Docente extends Persona {
  private long telefono;
  private String nss;

  public Docente(String nombre, int edad, long telefono, String nss) {
    super(nombre, edad);
    this.telefono = telefono;
    this.nss = nss;
  }

  public long getTelefono() {
    return telefono;
  }

  public String getNss() {
    return nss;
  }

  public void setTelefono(long telefono) {
    this.telefono = telefono;
  }

  public void setNss(String nss) {
    this.nss = nss;
  }
}
