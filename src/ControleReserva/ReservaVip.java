package ControleReserva;

public class ReservaVip extends Reserva {
    @Override
    public void reservar() {
        System.out.println("Reserva Vip confirmada com atendimento exclusivo");
    }
}
