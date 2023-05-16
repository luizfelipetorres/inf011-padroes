package model;

public class Livro extends Produto{
  private String isbn;

  public Livro(String codigo, String nome, Double preco) {
    super(codigo, nome, preco);
  }

  @Override
  public String toString() {
    return "\n\tLivro{" +
        "isbn='" + isbn + '\'' +
        ", codigo='" + codigo + '\'' +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        '}';
  }
}
