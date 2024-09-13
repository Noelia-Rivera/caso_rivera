package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscaso.dao.GeneroDAO;
import pe.edu.upeu.syscaso.entity.Genero;
import pe.edu.upeu.syscaso.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{

	@Autowired
	private GeneroDAO dao;

	@Override
	public Genero create(Genero a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Genero update(Genero a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
