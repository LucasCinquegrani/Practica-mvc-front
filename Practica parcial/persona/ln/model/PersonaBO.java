package persona.ln.model;

import java.util.List;

import persona.ad.data_access.PersonaAD;
import persona.ad.data_access.PersonaADImpl;
import persona.ln.domain.Persona;

public class PersonaBO implements PersonaBOImpl {

    @Override
    public List<Persona> getPersonas() {

        PersonaADImpl persona = new PersonaAD();
        List<Persona> personas = persona.findByAll();
        return personas;
    }


}
