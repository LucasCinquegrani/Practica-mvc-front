package persona.fe;
import persona.ln.model.PersonaBO;


public class Controller {
    private PersonaBO personaBo;
    private View view;

    public Controller(){
        personaBo = new PersonaBO();
        view = new View();
    }

    public void execute(){
        view.presentarLista(personaBo.getPersonas());

    }

}
