package desafio.espiral;

import java.util.Objects;

import desafio.numero.Numero;
import desafio.utilitarios.View;

public class MatrizView {

    public int solicitarDimension() {
        int dimension;

        System.out.println();
        System.out.println("Recorrido Espiral");
        System.out.println("-----------------");
        System.out.print("Ingresar el tamaño de la Matriz: ");
        dimension = View.getSc().nextInt();

        return dimension;
    }

    public void presentarMatriz(Matriz matriz) {

        System.out.println();
        for (int i = 0; i < matriz.getDimension(); i++) {
            for (int j = 0; j < matriz.getDimension(); j++) {
                Numero numero = matriz.getMatriz()[i][j];
                if (Objects.isNull(numero)) {
                    System.out.print("  ");
                } else {
                    System.out.print(numero.getNumero());
                }
            } // enf for j
            System.out.println();
        } // end for i
    } // fin presentarMatriz()
}
