package pe.edu.upeu.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscaso.dao.RentaDAO;
import pe.edu.upeu.syscaso.entity.Renta;
import pe.edu.upeu.syscaso.service.RentaService;

@Service
public class RentaServiceImpl implements RentaService{

	@Autowired
	private RentaDAO dao;

	@Override
	public Renta create(Renta a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Renta update(Renta a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	
	
    
}
