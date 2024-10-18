package desafio.menu;

import desafio.espiral.MatrizController;
import desafio.miPrimerPrograma.Saludar;
import desafio.numero.NumeroController;

public class MenuController {
    private MenuView menuView;

    public void execute() {
        int opcion;
        menuView = new MenuView();

        do {
            menuView.presentarMenu();
            opcion = menuView.solicitarOpcion();
            switch (opcion) {
                case 1 ->
                    new Saludar().execute();
                case 2 ->
                    new NumeroController().execute();
                case 3 ->
                    new MatrizController().execute();
                case 4 ->
                    menuView.presentarMensaje("Se seleccionó la Opción 4.");
                case 5 ->
                    menuView.presentarMensaje("Se seleccionó la Opción 4.");
                case 9 ->
                    menuView.presentarMensaje("Bye.");
                default ->
                    menuView.presentarMensaje("Se seleccionó una Opción incorrecta.");
            }
        } while (9 != opcion);
    }

}
