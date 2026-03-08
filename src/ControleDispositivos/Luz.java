package ControleDispositivos;

public class Luz implements Controlavel {

    private boolean estado = false;

    @Override
    public void ligar() {
        if (estado == false){
            estado = true;
            System.out.println("Luz foi ligada!!");
        } else {
            System.out.println("A luz já se encontra liga!!");
        }
    }

    @Override
    public void desligar() {
        if (estado == true) {
            estado = false;
            System.out.println("Luz foi desligada!!");
        } else {
            System.out.println("A luz já se encontra desligada");
        }

    }
}
