package ec.edu.ups.EVAbedoyamanuel.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EVAbedoyamanuel.DAO.LibroDAO;
import ec.edu.ups.EVAbedoyamanuel.model.Libro;

@Stateless
public class LibroON implements LibroONLocal {

	@Inject
	private LibroDAO daolibro;
	
	public void insertar(Libro l) throws Exception {
		daolibro.insert(l);
	}
	public List<Libro> getLibros(){
	return daolibro.getList();	
	}
}
