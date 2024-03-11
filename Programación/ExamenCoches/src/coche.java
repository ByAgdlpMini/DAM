public class coche {

  public String modelo;

  public String marca;

  public String dueño;

  public String estado;

  public Integer id;

  public coche(String modelo, String marca, String dueño, String estado, Integer id) {
    this.modelo = modelo;
    this.marca = marca;
    this.dueño = dueño;
    this.estado = estado;
    this.id = id;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getDueño() {
    return dueño;
  }

  public void setDueño(String dueño) {
    this.dueño = dueño;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String nuevoEstado) {
    this.estado = nuevoEstado;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "coche [modelo=" + modelo + ", marca=" + marca + ", dueño=" + dueño + ", estado=" + estado + ", id=" + id
        + "]";
  }

}