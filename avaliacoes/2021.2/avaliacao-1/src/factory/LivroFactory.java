package factory;

import model.Livro;
import model.Produto;

public class LivroFactory implements ProdutoFactory{

  @Override
  public Produto criarProduto(String codigo, String nome, Double preco) {
    return new Livro(codigo, nome, preco);
  }
}
