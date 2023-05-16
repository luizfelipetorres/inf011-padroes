package builder;

import factory.ProdutoFactory;
import factory.TipoProduto;
import model.Disciplina;
import model.Livro;

public class Director {

  public void criarCursoPadroes(Builder cursoBuilder) {
    ProdutoFactory disciplinaFactory = TipoProduto.DISCIPLINA.getFactory();
    ProdutoFactory livroFactory = TipoProduto.LIVRO.getFactory();
    Disciplina fm = (Disciplina) disciplinaFactory.criarProduto("ABCD1", "Factory Method",
        20d);
    fm.setChTotal(50);
    Disciplina af = (Disciplina) disciplinaFactory.criarProduto("ABCD2", "Abstract Factory",
        20d);
    af.setChTotal(20);
    cursoBuilder
        .comCodigo("ABC")
        .comNome("Padrões criacionais")
        .comDisciplina(fm)
        .comDisciplina(af)
        .comLivro((Livro) livroFactory.criarProduto("ABCL1", "Padrões de projeto", 40.0));

  }

}
