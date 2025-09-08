package es.iesjandula.reaktor.base.security.models;

import java.util.List;

/**
 * @author Francisco Manuel Benítez Chico
 */
public class DtoUsuarioExtended extends DtoUsuarioBase
{
	/** Atributo - roles */
	private List<String> roles ;
	
	/** Atributo - JWT */
	private String jwt ;

	/**
	 * Constructor por defecto
	 */
	public DtoUsuarioExtended()
	{
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param email
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 * @param roles
	 * @param jwt
	 */
	public DtoUsuarioExtended(String email, String nombre, String apellidos, String departamento, List<String> roles, String jwt)
	{
		super(email, nombre, apellidos, departamento);
		this.roles = roles;
		this.jwt = jwt;
	}

	/**
	 * Getter para el atributo roles
	 * @return los roles del usuario
	 */
	public List<String> getRoles()
	{
		return this.roles;
	}
	
	/**
	 * Getter para el atributo jwt
	 * @return el jwt del usuario
	 */
	public String getJwt()
	{
		return this.jwt;
	}

	/**
	 * Setter para el atributo roles
	 * @param roles los roles del usuario
	 */
	public void setRoles(List<String> roles)
	{
		this.roles = roles;
	}

	/**
	 * Setter para el atributo jwt
	 * @param jwt el jwt del usuario
	 */
	public void setJwt(String jwt)
	{
		this.jwt = jwt;
	}
}
