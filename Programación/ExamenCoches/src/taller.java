import java.util.LinkedList;
import java.util.List;

public class taller {

  private List<coche> ListaCoches = new LinkedList<>();

  private String nombre;

  private String direccion;

  public taller(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
  }

  public List<coche> getListaCoches() {
    return ListaCoches;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setListaCoches(List<coche> listaCoches) {
    this.ListaCoches = listaCoches;
  }

  public void añadirCoche(coche c) {
    this.ListaCoches.add(c);
  }

  public void eliminarCoche(int pos) {
    this.ListaCoches.remove(pos);
  }

  public void cambiarEstadoCoche(int pos, String estado) {
    if (pos >= 0 && pos < ListaCoches.size()) {
      coche coche = ListaCoches.get(pos);
      coche.setEstado(estado);
    } else {
      System.out.println("Posición inválida.");
    }
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "taller [ListaCoches=" + ListaCoches + ", nombre=" + nombre + ", direccion=" + direccion + "]";
  }

}