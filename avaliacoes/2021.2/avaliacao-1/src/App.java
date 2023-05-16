import builder.CursoBuilder;
import builder.Director;
import builder.EmentaBuilder;
import factory.ProdutoCreator;
import factory.ProdutoFactory;
import factory.TipoProduto;
import model.Curso;
import model.Disciplina;
import model.Livro;
import model.Produto;

public class App {

  public static void main(String[] args) {
    ProdutoFactory livroFactory = TipoProduto.LIVRO.getFactory();
    ProdutoFactory disciplinaFactory = TipoProduto.DISCIPLINA.getFactory();

    CursoBuilder cursoBuilder = new CursoBuilder();
    EmentaBuilder ementaBuilder = new EmentaBuilder();
    Director director = new Director();
    director.criarCursoPadroes(cursoBuilder);
    director.criarCursoPadroes(ementaBuilder);
    System.out.println(cursoBuilder.criar());
    System.out.println(ementaBuilder.criarEmenta());


  }
}
