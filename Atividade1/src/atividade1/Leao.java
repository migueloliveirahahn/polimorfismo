package atividade1;
public class Leao extends Animal{
    public Leao(String nome, int idade, double peso) {
    super(nome, idade, peso);
    }
  @Override
    public void emitirSom() {
        System.out.println("roar");
    }   
}
