package model;

import java.util.List;
import builder.CursoBuilder;


public class Curso extends Produto{
  private List<Disciplina> disciplinas;
  private List<Livro> livros;

  public static CursoBuilder builder(){
    return new CursoBuilder();
  }

  public Curso(String codigo, String nome, Double preco, List<Disciplina> disciplinas,
               List<Livro> livros) {
    super(codigo, nome, preco);
    this.disciplinas = disciplinas;
    this.livros = livros;
  }
}
