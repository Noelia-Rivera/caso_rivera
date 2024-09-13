package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Empleado;

public interface EmpleadoDAO {

	Empleado create(Empleado em);
	Empleado update(Empleado em);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
