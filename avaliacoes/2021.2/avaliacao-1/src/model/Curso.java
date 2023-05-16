package model;

import java.util.List;

import builder.CursoBuilder;
import prototype.Prototype;


public class Curso extends Produto implements Prototype<Curso> {

  private List<Disciplina> disciplinas;
  private List<Livro> livros;

  public Curso(Curso curso) {
    this(curso.codigo, curso.nome, curso.preco, curso.disciplinas
        .stream()
        .map(Disciplina::clone)
        .toList(), curso.livros
        .stream()
        .map(Livro::clone)
        .toList());
  }

  public Curso(String codigo, String nome, Double preco, List<Disciplina> disciplinas,
               List<Livro> livros) {
    super(codigo, nome, preco);
    this.disciplinas = disciplinas;
    this.livros = livros;
  }

  public static CursoBuilder builder() {
    return new CursoBuilder();
  }

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  @Override
  public Curso clone() {
    return new Curso(this);
  }

  @Override
  public String toString() {
    return "Curso{" +
        "disciplinas=" + disciplinas +
        ", livros=" + livros +
        ", codigo='" + codigo + '\'' +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        '}';
  }
}
