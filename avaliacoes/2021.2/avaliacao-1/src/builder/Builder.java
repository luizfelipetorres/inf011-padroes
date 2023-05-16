package builder;

import model.Curso;
import model.Disciplina;
import model.Livro;

interface Builder {
  Builder comNome(String nome);
  Builder comLivro(Livro livro);
  Builder comDisciplina(Disciplina disciplina);
  Builder comCodigo(String codigo);

}
