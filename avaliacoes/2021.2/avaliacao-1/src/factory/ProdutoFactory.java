package factory;

import model.Produto;

public interface ProdutoFactory {

  Produto criarProduto(String codigo, String nome, Double preco);


}
