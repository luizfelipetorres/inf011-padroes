package model;

public class Nutriente {

  private String nome;
  private String unidade;
  private Double caloriaPorUnidade;

  public Nutriente() {
  }

  public Nutriente(String nome, String unidade, Double caloriaPorUnidade) {
    this.nome = nome;
    this.unidade = unidade;
    this.caloriaPorUnidade = caloriaPorUnidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUnidade() {
    return unidade;
  }

  public void setUnidade(String unidade) {
    this.unidade = unidade;
  }

  public Double getCaloriaPorUnidade() {
    return caloriaPorUnidade;
  }

  public void setCaloriaPorUnidade(Double caloriaPorUnidade) {
    this.caloriaPorUnidade = caloriaPorUnidade;
  }
}
