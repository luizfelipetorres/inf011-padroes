package model;

public class Maquina extends Equipamento {

  private String descricao;
  private String marca;

  public Maquina(String identificador, Integer quantidade) {
    super(identificador, quantidade);
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
}
