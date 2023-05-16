package factory;

import model.Produto;

public class ProdutoCreator {

  public Produto getProduto(TipoProduto tipo, String nome, String codigo, Double valor) {
    ProdutoFactory factory = tipo.getFactory();
    return factory.criarProduto(nome, codigo, valor);
  }
}
