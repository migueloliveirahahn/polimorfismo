package atividade2;
public class Aviao extends Veiculo{
  public Aviao(String marca, String modelo , int ano) {
  super(marca,modelo,ano);
  }    
 @Override
  public void mover() {
  System.out.println("O avião está voando.");
  } 
}
