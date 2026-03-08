package ControleDispositivos;

public class ArCondicionado implements Controlavel {

    private boolean estado = false;

    @Override
    public void ligar() {
        if (estado == false){
            estado = true;
            System.out.println("Ar-condicionado foi ligado!!");
        } else {
            System.out.println("Ar-condicionado já se encontra liga!!");
        }

    }

    @Override
    public void desligar() {
        if (estado == true) {
            estado = false;
            System.out.println("Ar-condicionado foi desligado!!");
        } else {
            System.out.println("Ar-condicionado já se encontra desligada");
        }

    }
}
