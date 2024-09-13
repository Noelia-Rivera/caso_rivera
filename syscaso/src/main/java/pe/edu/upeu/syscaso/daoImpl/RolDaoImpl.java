package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.RolDAO;
import pe.edu.upeu.syscaso.entity.Rol;
import pe.edu.upeu.syscaso.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDAO{

	@Autowired
	private RolRepository repository;
	
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
