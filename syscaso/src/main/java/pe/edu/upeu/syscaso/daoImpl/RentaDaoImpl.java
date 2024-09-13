package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.RentaDAO;
import pe.edu.upeu.syscaso.entity.Renta;
import pe.edu.upeu.syscaso.repository.RentaRepository;

@Component
public class RentaDaoImpl implements RentaDAO{

	@Autowired
	private RentaRepository repository;
	
	@Override
	public Renta create(Renta a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Renta update(Renta a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
