package devART.uca.capas.repositories;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import devART.uca.capas.domain.Expediente;


public interface ExpedienteRepository extends JpaRepository<Expediente, Integer> {
	@Query(nativeQuery=true, value="SELECT * FROM public.expediente")
	public List<Expediente> mostrarTodo() throws DataAccessException;
}