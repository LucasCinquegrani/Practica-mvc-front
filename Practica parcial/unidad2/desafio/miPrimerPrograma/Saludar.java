package desafio.miPrimerPrograma;

/*
 * mi primer programa
 */
public class Saludar {

    // atributo
    String mensaje;

    // método Constructor default
    public Saludar() {
        setMensaje("Hola Mundo!... por Constructor default.");
    }

    // método Constructor Sobrecargado
    public Saludar(String mensaje) {
        setMensaje(mensaje.concat("... por Constructor Sobrecargado."));
    }

    // método Consultor / getter
    public String getMensaje() {
        return mensaje;
    }

    // método Modificador / setter
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void execute() {

        System.out.println();
        System.out.println("Primer Programa");
        System.out.println("---------------");
        System.out.println("desde Paradigma OO...");
        Saludar saludo = new Saludar();
        String mensaje = saludo.getMensaje();
        System.out.println(mensaje);

        saludo = new Saludar("Hola Mundo!");
        mensaje = saludo.getMensaje();
        System.out.println(mensaje);

        saludo = new Saludar();
        saludo.setMensaje("Hola Mundo!... por setter / getter.");
        mensaje = saludo.getMensaje();
        System.out.println(mensaje);
    }

    /*
     * método punto de ejecución del código java
     */
    public static void main(String[] args) {

        // Inicio
        System.out.println();
        System.out.println("desde Paradigma Estructurado..");
        System.out.println("Hola Mundo!");

        new Saludar().execute();
    }
}