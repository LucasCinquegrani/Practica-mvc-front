package desafio.espiral;

public class MatrizController {
    private Matriz matriz;
    private MatrizView matrizView;
    private int dimension;

    public void execute() {

        matrizView = new MatrizView();

        dimension = matrizView.solicitarDimension();

        matriz = new Matriz(dimension);
        matriz.calcularRecorrido();

        matrizView.presentarMatriz(matriz);
    }
}
