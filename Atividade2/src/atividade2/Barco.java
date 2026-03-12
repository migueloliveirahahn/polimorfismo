package atividade2;

public class Barco extends Veiculo {
    public Barco(String marca, String modelo , int ano){
    super(marca,modelo,ano);
    }
@Override
    public void mover(){
    System.out.println("O barco está atracado");   
    }
}