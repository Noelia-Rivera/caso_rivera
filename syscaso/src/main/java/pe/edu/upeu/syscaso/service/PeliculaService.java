package pe.edu.upeu.syscaso.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscaso.entity.Pelicula;

public interface PeliculaService {
	Pelicula create(Pelicula p);
	Pelicula update(Pelicula p);
	void delete(Long id);
	Optional<Pelicula> read(Long id);
	List<Pelicula> readAll();
}
