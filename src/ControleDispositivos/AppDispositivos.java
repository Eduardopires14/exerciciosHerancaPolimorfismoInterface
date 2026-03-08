package ControleDispositivos;

public class AppDispositivos {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
