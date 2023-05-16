package model;

public class Disciplina extends Produto{
  private Integer chTotal;
  private Double pctCumprido;

  public void setChTotal(Integer chTotal) {
    this.chTotal = chTotal;
  }

  public void setPctCumprido(Double pctCumprido) {
    this.pctCumprido = pctCumprido;
  }

  public Disciplina(String codigo, String nome, Double preco) {
    super(codigo, nome, preco);
  }

  public Integer getChTotal() {
    return chTotal;
  }

  public Double getPctCumprido() {
    return pctCumprido;
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
}
