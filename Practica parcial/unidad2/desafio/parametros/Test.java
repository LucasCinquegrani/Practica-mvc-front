package desafio.parametros;

import desafio.numero.Numero;

public class Test {

    public void prueba(int numero, Numero otroNumero) {

        numero += 5;
        otroNumero.setNumero(otroNumero.getNumero() + 7);

        System.out.println("dato en meto prueba()...");
        System.out.println(numero);
        System.out.println(otroNumero.getNumero());
    }

    public static void main(String[] args) {

        int numero = 360;
        Numero otroNumero = new Numero();
        otroNumero.setNumero(60);

        System.out.println("dato iniciales...");
        System.out.println(numero);
        System.out.println(otroNumero.getNumero());

        Test test = new Test();
        test.prueba(numero, otroNumero);

        System.out.println("dato finales...");
        System.out.println(numero);
        System.out.println(otroNumero.getNumero());
    }
}
