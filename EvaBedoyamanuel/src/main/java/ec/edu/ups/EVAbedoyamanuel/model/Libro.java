package ec.edu.ups.EVAbedoyamanuel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_libro")
public class Libro implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="lib_codigo")
private int codigo;
 
@Column(name="lib_titulo")
private String titulo;

@Column(name="lib_autor")
private String autor;

@Column(name="lib_edicion")
private String edicion;

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getEdicion() {
	return edicion;
}

public void setEdicion(String edicion) {
	this.edicion = edicion;
}

@Override
public String toString() {
	return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + "]";
}


	
}
