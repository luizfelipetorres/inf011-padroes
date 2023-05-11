package model;

public abstract class Equipamento {

  private String identificador;
  private Integer quantidade;

  public Equipamento(String identificador, Integer quantidade) {
    this.identificador = identificador;
    this.quantidade = quantidade;
  }
}
