package ec.edu.ups.EVAbedoyamanuel.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EVAbedoyamanuel.model.Libro;


@Stateless
public class LibroDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert( Libro l) {
		em.persist(l);
	}
	public List<Libro> getList(){
		List<Libro> libros = new ArrayList<Libro>();
		String jpql = "SELECT l FROM Libro l ";
		Query query = em.createQuery(jpql, Libro.class);
		libros = query.getResultList();
		return libros;
	}
}
