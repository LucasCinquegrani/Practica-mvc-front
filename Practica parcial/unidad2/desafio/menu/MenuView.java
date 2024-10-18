package desafio.menu;

import desafio.utilitarios.View;

public class MenuView {

    public int solicitarOpcion() {
        int opcion;

        opcion = View.getSc().nextInt();

        return opcion;
    }

    public void presentarMenu() {

        System.out.println();
        System.out.println("Menú de Opciones");
        System.out.println("----------------");
        System.out.println("1 - Opción Primer Programa");
        System.out.println("2 - Opción Número Par / Impar");
        System.out.println("3 - Opción Recorrido Espiral");
        System.out.println("4 - Opción ...");
        System.out.println("5 - Opción ...");
        System.out.println("9 - Opción Salir");
        System.out.print("Ingresar el número de Opción: ");
    }

    public void presentarMensaje(String mensaje) {
        System.out.println(mensaje);

    }
}
