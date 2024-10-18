package persona.fe;
import java.util.List;
import persona.ln.domain.Persona;


public class View {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m"; 
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CIAN = "\u001B[96m";
    public static final String ANSI_FONDO_BLANCO = "\\u001B[47m";

    public void presentarLista(List<Persona> personas) {
        System.out.println("----------------------------");
        System.out.printf("%-15s %5s%n", "Nombre", "Edad");
        System.out.println("----------------------------");
        for (Persona persona : personas) {
            System.out.printf(ANSI_CIAN + "%-15s" +ANSI_PURPLE + "%4d%n" + ANSI_RESET, persona.getNombre(), persona.getEdad());
        }
    }
    

}
