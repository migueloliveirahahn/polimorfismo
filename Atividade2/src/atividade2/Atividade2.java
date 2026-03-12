package atividade2;
public class Atividade2 {
    public static void main(String[] args) {
        
        Moto m1 = new Moto("Kawasaki" ,"Ninja" , 2019 );
        Carro c1 = new Carro("Honda","Civic", 2022 );
        Bicicleta bic = new Bicicleta("Caloi","Elite 20", 2022);
        Aviao a1 = new Aviao("Embraer", "E195-E2", 2018);
        Barco b1 = new Barco("Schaefer", "Phantom 360" , 2021);

        m1.mover();
        c1.mover();
        bic.mover();
        a1.mover();
        b1.mover();
    }
    
}
