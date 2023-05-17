package interfaces;

import model.Alimento;

public interface Builder {

  Builder isLowCarb(boolean b);

  Builder isVegano(boolean b);

  Builder isSemLactose(boolean b);

  Builder isSemGlutem(boolean b);

  Builder isReduzidoSodio(boolean b);

  Builder comoFazer(String modo);

  Builder reset();

  Builder comAlimento(Alimento a);
}
