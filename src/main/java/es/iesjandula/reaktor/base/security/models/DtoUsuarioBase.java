package es.iesjandula.reaktor.base.security.models;

import java.util.Objects;

/**
 * @author Francisco Manuel Benítez Chico
 */
public class DtoUsuarioBase
{
	/** Atributo - Email */
	private String email ;
	
	/** Atributo - Nombre */
	private String nombre ;
	
	/** Atributo - Apellidos */
	private String apellidos ;

	/** Atributo - Departamento */
	private String departamento ;

	/**
	 * Constructor por defecto
	 */
	public DtoUsuarioBase()
	{
		// Vacío
	}
	
	/**
	 * Constructor con parámetros
	 * @param email
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 */
	public DtoUsuarioBase(String email, String nombre, String apellidos, String departamento)
	{
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	/**
	 * Getter para el atributo email
	 * @return el email del usuario
	 */
	public String getEmail()
	{
		return this.email;
	}

	/**
	 * Getter para el atributo nombre
	 * @return el nombre del usuario
	 */
	public String getNombre()
	{
		return this.nombre;
	}

	/**
	 * Getter para el atributo apellidos
	 * @return los apellidos del usuario
	 */
	public String getApellidos()
	{
		return this.apellidos;
	}

	/**
	 * Getter para el atributo departamento
	 * @return el departamento del usuario
	 */
	public String getDepartamento()
	{
		return this.departamento;
	}

	/**
	 * Setter para el atributo email
	 * @param email el email del usuario
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Setter para el atributo nombre
	 * @param nombre el nombre del usuario
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}	

	/**
	 * Setter para el atributo apellidos
	 * @param apellidos los apellidos del usuario
	 */
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	/**	
	 * Setter para el atributo departamento
	 * @param departamento el departamento del usuario
	 */
	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}

	/**
	 * Método para comparar si el objeto es igual al objeto pasado como parámetro
	 * @param obj el objeto a comparar
	 * @return true si el objeto es igual al objeto pasado como parámetro, false en caso contrario
	 */
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		else if (obj == null)
		{
			return false;
		}
		else if (getClass() != obj.getClass())
		{
			return false;
		}
		
		DtoUsuarioBase other = (DtoUsuarioBase) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre) && Objects.equals(apellidos, other.apellidos) && Objects.equals(departamento, other.departamento);
	}

	/**
	 * Método para calcular el hash del objeto
	 * @return el hash del objeto
	 */
	public int hashCode()
	{
		return Objects.hash(email, nombre, apellidos, departamento);
	}
}
