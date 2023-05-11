package model;

public class Acessorio extends Equipamento {

  private String descricao;

  public Acessorio(String identificador, Integer quantidade) {
    super(identificador, quantidade);
  }


  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
