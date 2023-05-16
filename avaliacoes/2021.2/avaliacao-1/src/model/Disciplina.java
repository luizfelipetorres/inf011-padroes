package model;

import prototype.Prototype;

public class Disciplina extends Produto implements Prototype<Disciplina> {

  private Integer chTotal;
  private Double pctCumprido;

  public Disciplina(Disciplina disciplina) {
    this(disciplina.codigo, disciplina.nome, disciplina.preco, disciplina.chTotal,
        disciplina.pctCumprido);
  }

  public Disciplina(String codigo, String nome, Double preco, Integer chTotal, Double pctCumprido) {
    super(codigo, nome, preco);
    this.chTotal = chTotal;
    this.pctCumprido = pctCumprido;
  }

  public Disciplina(String codigo, String nome, Double preco) {
    super(codigo, nome, preco);
  }

  public Integer getChTotal() {
    return chTotal;
  }

  public void setChTotal(Integer chTotal) {
    this.chTotal = chTotal;
  }

  public Double getPctCumprido() {
    return pctCumprido;
  }

  public void setPctCumprido(Double pctCumprido) {
    this.pctCumprido = pctCumprido;
  }

  @Override
  public String toString() {
    return "\n\tDisciplina{" +
        "chTotal=" + chTotal +
        ", pctCumprido=" + pctCumprido +
        ", codigo='" + codigo + '\'' +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        '}';
  }

  @Override
  public Disciplina clone() {
    return new Disciplina(this);
  }
}
