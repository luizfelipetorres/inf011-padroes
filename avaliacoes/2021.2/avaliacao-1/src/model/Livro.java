package model;

import prototype.Prototype;

public class Livro extends Produto implements Prototype<Livro> {

  private String isbn;

  public Livro(String codigo, String nome, Double preco) {
    super(codigo, nome, preco);
  }

  public Livro(Livro livro) {
    this(livro.codigo, livro.nome, livro.preco, livro.isbn);
  }

  public Livro(String codigo, String nome, Double preco, String isbn) {
    super(codigo, nome, preco);
    this.isbn = isbn;
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

  @Override
  public Livro clone() {
    return new Livro(this);
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
