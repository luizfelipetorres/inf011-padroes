package model;

public class FichaNutricional {

  private int qtdCHO;
  private int qtdePTN;
  private int qtdeLIP;

  public FichaNutricional() {
  }

  public FichaNutricional(int qtdCHO, int qtdePTN, int qtdeLIP) {
    this.qtdCHO = qtdCHO;
    this.qtdePTN = qtdePTN;
    this.qtdeLIP = qtdeLIP;
  }

  public int getQtdCHO() {
    return qtdCHO;
  }

  public void setQtdCHO(int qtdCHO) {
    this.qtdCHO = qtdCHO;
  }

  public int getQtdePTN() {
    return qtdePTN;
  }

  public void setQtdePTN(int qtdePTN) {
    this.qtdePTN = qtdePTN;
  }

  public int getQtdeLIP() {
    return qtdeLIP;
  }

  public void setQtdeLIP(int qtdeLIP) {
    this.qtdeLIP = qtdeLIP;
  }
}
