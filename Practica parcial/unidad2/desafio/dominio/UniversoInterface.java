package desafio.dominio;

import desafio.numero.Numero;

public interface UniversoInterface {

    Numero[][] getMatriz();

    void newMatriz(int dimension);

    int getDimension();

    void setDimension(int dimension);

    void clear();

}