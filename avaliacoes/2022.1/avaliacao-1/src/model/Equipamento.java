package model;

public abstract class Equipamento {

  private final String identificador;
  private Integer quantidade;

  public Equipamento(String identificador, Integer quantidade) {
    this.identificador = identificador;
    this.quantidade = quantidade;
  }

  public void incrementarQuantidade(int quantidade) {
    this.quantidade += quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Equipamento that = (Equipamento) o;

    return identificador.equals(that.identificador);
  }

  @Override
  public int hashCode() {
    return identificador.hashCode();
  }
}
