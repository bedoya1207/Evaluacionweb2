package ec.edu.ups.EVAbedoyamanuel.services;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.EVAbedoyamanuel.bussines.LibroONLocal;
import ec.edu.ups.EVAbedoyamanuel.model.Libro;

@WebService
public class LibroServicesSOAP {

	@Inject
	private LibroONLocal libroOn;
	
	@WebMethod
	public String crearlibro(Libro l) throws Exception{
		try {
			libroOn.insertar(l);
			return "libro insertado";
		} catch (Exception e) {
			
			return "no se inserto el libro";
		}	
	}
	public List<Libro> getlibros(){
		return libroOn.getLibros();
	}
}
