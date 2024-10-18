package desafio.espiral;

import java.util.Random;

import desafio.dominio.Universo;
import desafio.numero.Numero;

public class Matriz extends Universo {

    public Matriz(int dimension) {
        setDimension(dimension);
    }

    public void clearLocal() {
        // completar
        System.out.println("soy clear() y estoy en Matriz.");
    }

    public void calcularRecorrido() {
        // completar
        int extremoFila = getDimension();
        int extremoColumna = getDimension();
        int baseFila = 0;
        int baseColumna = 0;
        int i, j;

        clear();
        this.clear();
        super.clear();

        do {
            i = baseFila;
            j = baseColumna;
            while (j < extremoColumna) {
                Numero numero = new Numero();
                numero.setNumero(new Random().nextInt(10, 100));
                getMatriz()[i][j] = numero;
                j++;
            }
            j--;
            while (i < extremoFila) {
                Numero numero = new Numero();
                numero.setNumero(new Random().nextInt(10, 100));
                getMatriz()[i][j] = numero;
                i++;
            }
            i--;
            while (j > baseColumna) {
                Numero numero = new Numero();
                numero.setNumero(new Random().nextInt(10, 100));
                getMatriz()[i][j] = numero;
                j--;
            }
            j++;
            baseFila++;
            while (i > baseFila) {
                Numero numero = new Numero();
                numero.setNumero(new Random().nextInt(10, 100));
                getMatriz()[i][j] = numero;
                i--;
            }
            baseFila++;
            baseColumna += 2;
            extremoFila -= 2;
            extremoColumna -= 2;
        } while (baseFila < extremoFila);

    }

}