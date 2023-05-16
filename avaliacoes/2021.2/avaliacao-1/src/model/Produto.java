package model;

public abstract class Produto {
  protected String codigo;
  protected String nome;
  protected Double preco;

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public Double getPreco() {
    return preco;
  }

  public Produto(String codigo, String nome, Double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }
}
