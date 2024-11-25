package pe.edu.i202215291.cl1_jpa_data_galvez_dorian.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202215291.cl1_jpa_data_galvez_dorian.entidades.Country;

public interface CountryRepository  extends CrudRepository<Country, String> {
}
