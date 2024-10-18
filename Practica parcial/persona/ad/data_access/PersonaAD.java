package persona.ad.data_access;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import persona.ln.domain.Persona;

public class PersonaAD implements PersonaADImpl {
    private List<Persona> datos;
    private String nombreArchivoCsv;
    private CSVReader csvreader;

    public PersonaAD() {
        this.nombreArchivoCsv = "persona/ad/data/persona.csv";
        this.datos = new ArrayList<Persona>();
    }

    @Override
    public List<Persona> findByAll() {

        try {
            FileReader apuntadorAlArchivo = new FileReader(nombreArchivoCsv);
            csvreader = new CSVReader(apuntadorAlArchivo);
            String[] fila;

            while (null != (fila = csvreader.readNext())) {
                Persona persona = new Persona();
                persona.setNombre(fila[0]);
                persona.setEdad(Integer.parseInt(fila[1]));
                datos.add(persona);
            }
            csvreader.close();

        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }
        return datos;
    }


}
