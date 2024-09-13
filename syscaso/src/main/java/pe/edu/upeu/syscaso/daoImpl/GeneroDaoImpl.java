package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.GeneroDAO;
import pe.edu.upeu.syscaso.entity.Genero;
import pe.edu.upeu.syscaso.repository.GeneroRepository;

@Component
public class GeneroDaoImpl implements GeneroDAO{

	@Autowired
	private GeneroRepository repository;
	
	@Override
	public Genero create(Genero a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Genero update(Genero a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
