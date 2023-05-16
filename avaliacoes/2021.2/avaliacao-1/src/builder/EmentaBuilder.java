package builder;

import java.util.ArrayList;
import java.util.List;

import model.Disciplina;
import model.Livro;

public class EmentaBuilder implements Builder {

  private String nome;
  private String codigo;
  private List<Livro> livros;
  private List<Disciplina> disciplinas;

  @Override
  public Builder comNome(String nome) {
    this.nome = nome;
    return this;
  }

  @Override
  public Builder comLivro(Livro livro) {
    livros.add(livro);
    return this;
  }

  public EmentaBuilder() {
    this.nome = "Curso";
    disciplinas = new ArrayList<>();
    livros = new ArrayList<>();
  }

  @Override
  public Builder comDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
    return this;
  }

  @Override
  public Builder comCodigo(String codigo) {
    return this;
  }

  public String criarEmenta() {



    return new StringBuilder()
        .append(String.format("Nome do curso: %s\n", nome))
        .append(String.format("Livros: %s\n", livros))
        .append(String.format("Disciplinas: %s\n", disciplinas))
        .toString();
  }
}
