package factory;

import model.Disciplina;
import model.Produto;

public class DisciplinaFactory implements ProdutoFactory {

  @Override
  public Produto criarProduto(String codigo, String nome, Double preco) {
    return new Disciplina(codigo, nome, preco);
  }
}
