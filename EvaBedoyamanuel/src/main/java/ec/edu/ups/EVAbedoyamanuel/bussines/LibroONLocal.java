package ec.edu.ups.EVAbedoyamanuel.bussines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.EVAbedoyamanuel.model.Libro;

@Local
public interface LibroONLocal {

	public void insertar(Libro l) throws Exception;
	public List<Libro> getLibros();
}
