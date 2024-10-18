package desafio.numero;

import java.util.InputMismatchException;

import desafio.utilitarios.View;

public class NumeroView {

    public int solicitarDatos() {

        int dato;
        try {

            System.out.println();
            System.out.println("Número");
            System.out.println("------");
            System.out.print("Ingresar un número Entero: ");
            dato = View.getSc().nextInt();

        } catch (InputMismatchException ex) {
            System.out.println(ex.toString());
            dato = 0;

        }
        return dato;
    }

    public void presentarDatos(Numero numero) {
        if (0 == numero.getNumero() % 2) {
            System.out.println("El número " + numero.getNumero() + " es Par.");
        } else {
            System.out.println("El número " + numero.getNumero() + " es Impar.");
        }
    }
}
