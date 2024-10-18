package desafio.numero;

public class NumeroController {

    public void execute() {

        Numero numero = new Numero();
        NumeroView numeroView = new NumeroView();

        numero.setNumero(numeroView.solicitarDatos());

        numeroView.presentarDatos(numero);

    }
}
