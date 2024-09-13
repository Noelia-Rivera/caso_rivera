package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Rol;

public interface RolDAO {

	Rol create(Rol ro);
	Rol update(Rol ro);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
