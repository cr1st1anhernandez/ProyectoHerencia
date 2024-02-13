public class Docente extends Persona {
  private long telefono;
  private String nss;

  public Docente(String nombre, int edad, char genero, long telefono, String nss) {
    super(nombre, edad, genero);
    this.telefono = telefono;
    this.nss = nss;
  }

  @Override
  public String toString() {
    return "Docente [id=" + getId() + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", genero=" + getGenero() + ", telefono=" + telefono + ", nss=" + nss + "]";
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
