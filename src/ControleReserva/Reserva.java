package ControleReserva;

public class Reserva {
    private String data;
    private int qtdPessoas;

    public Reserva() {
    }

    public void reservar(){
        System.out.println("Reserva realizada!");
    }

    public void reservar (String data){
        this.data = data;
        System.out.println("Reserva feita para o dia " + getData());
    }

    public void reservar (String data, int qtdPessoas){
        this.data = data;
        this.qtdPessoas = qtdPessoas;
        System.out.println("Reserva feita para o dia " + getData() +
                " para " + getQtdPessoas() + " pessoas");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
