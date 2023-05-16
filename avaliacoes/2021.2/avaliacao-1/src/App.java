import builder.CursoBuilder;
import builder.Director;
import builder.EmentaBuilder;
import factory.ProdutoFactory;
import factory.TipoProduto;
import model.Curso;
import singleton.CatalogoCursos;

public class App {

  public static void main(String[] args) {

    //Q1
    ProdutoFactory livroFactory = TipoProduto.LIVRO.getFactory();
    ProdutoFactory disciplinaFactory = TipoProduto.DISCIPLINA.getFactory();

    //Q2
    CursoBuilder cursoBuilder = new CursoBuilder();
    EmentaBuilder ementaBuilder = new EmentaBuilder();
    Director director = new Director();
    director.criarCursoPadroes(cursoBuilder);
    director.criarCursoPadroes(ementaBuilder);
    Curso curso = cursoBuilder.criar();
    System.out.println(curso);
    System.out.println(ementaBuilder.criarEmenta());

    //Q3
    CatalogoCursos catalogo = CatalogoCursos.getInstance();
    Curso curso2 = curso.clone();
    curso2
        .getLivros()
        .forEach(l -> l.setNome("Alterado"));
    System.out.println("Depois do clone...");
    System.out.println(curso);
    System.out.println(curso2);
    catalogo.registrar(curso);
    String nomeCurso = curso.getNome();
    Curso cursoRegistro = catalogo.recuperarCopia(nomeCurso);
    System.out.println("Cópia do curso registrado: ");
    System.out.println(cursoRegistro);


  }
}
