public class Reserva {

    Propriedade propriedade;
    Usuario usuario;
    String checkIn;
    String checkOut;
    double custoTotal;

    public Reserva(Propriedade propriedade, Usuario usuario, String checkIn, String checkOut) {
        this.propriedade = propriedade;
        this.usuario = usuario;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void fazerReserva() {
        if (propriedade.disponibilidade) {
            propriedade.disponibilidade = false;
            calcularTotal();
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Propriedade indisponível.");
        }
    }

    public void calcularTotal() {
        custoTotal = propriedade.precoPorNoite;
    }
}