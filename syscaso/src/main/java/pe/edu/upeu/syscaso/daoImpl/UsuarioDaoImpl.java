package pe.edu.upeu.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscaso.dao.UsuarioDAO;
import pe.edu.upeu.syscaso.entity.Usuario;
import pe.edu.upeu.syscaso.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDAO{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
