package pe.edu.upeu.syscaso.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Pelicula;

public interface PeliculaDAO {

	Pelicula create(Pelicula p);
	Pelicula update(Pelicula p);
	void delete(Long id);
	Optional<Pelicula> read(Long id);
	List<Pelicula> readAll();
}
