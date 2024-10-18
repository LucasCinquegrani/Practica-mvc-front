package desafio.dominio;

import desafio.numero.Numero;

public abstract class Universo implements UniversoInterface {
    private Numero[][] matriz;
    protected int dimension;

    public Universo() {
    }

    @Override
    public Numero[][] getMatriz() {
        return matriz;
    }

    @Override
    public void newMatriz(int dimension) {
        this.matriz = new Numero[dimension][dimension];
    }

    @Override
    public int getDimension() {
        return dimension;
    }

    @Override
    public void setDimension(int dimension) {
        this.dimension = dimension;
        newMatriz(dimension);
    }

    @Override
    public void clear() {
        // completar
        System.out.println("soy clear() y estoy en Universo.");
    }

}
