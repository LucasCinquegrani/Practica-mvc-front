package desafio.numero;

/*
 * Informar si un número Entero es Par o Impar
 */
public class Numero {
    // atributo del tipo Numero
    private int numero;

    // método Constructor default
    public Numero() {
    }

    // método Consultor
    public int getNumero() {
        return numero;
    }

    // método Modificador
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean isPar() {
        if (0 == getNumero() % 2) {
            return true;
        }
        return false;
    }

}