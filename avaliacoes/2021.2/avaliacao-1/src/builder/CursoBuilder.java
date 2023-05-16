package builder;

import java.util.ArrayList;
import java.util.List;

import model.Curso;
import model.Disciplina;
import model.Livro;

public class CursoBuilder implements Builder {

  private String nome;
  private List<Livro> livros;
  private List<Disciplina> disciplinas;
  private String codigo;

  public CursoBuilder() {
    nome = "Curso";
    livros = new ArrayList<>();
    disciplinas = new ArrayList<>();
  }

  @Override
  public CursoBuilder comNome(String nome) {
    this.nome = nome;
    return this;
  }

  @Override
  public CursoBuilder comLivro(Livro livro) {
    this.livros.add(livro);
    return this;
  }

  @Override
  public CursoBuilder comDisciplina(Disciplina disciplina) {
    this.disciplinas.add(disciplina);
    return this;
  }

  @Override
  public CursoBuilder comCodigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  public Curso criar() {
    Double precoTotal= 0.0;
    for (Livro livro : livros) {
      precoTotal += livro.getPreco();
    }

    for (Disciplina disciplina : disciplinas) {
      precoTotal += disciplina.getPreco();
    }

    return new Curso(codigo, nome, precoTotal, disciplinas, livros);
  }
}
