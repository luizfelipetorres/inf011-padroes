package factory;

public enum TipoProduto {

  LIVRO {
    @Override
    public LivroFactory getFactory() {
      return new LivroFactory();
    }
  },

  DISCIPLINA {
    @Override
    public DisciplinaFactory getFactory() {
      return new DisciplinaFactory();
    }
  };


  public abstract ProdutoFactory getFactory();
}
