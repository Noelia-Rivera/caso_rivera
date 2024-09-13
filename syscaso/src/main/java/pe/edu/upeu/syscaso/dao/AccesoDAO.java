package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Acceso;

public interface AccesoDAO {

	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	Acceso registrarAccesoRol(Long accesoId, Long rolId);
}
