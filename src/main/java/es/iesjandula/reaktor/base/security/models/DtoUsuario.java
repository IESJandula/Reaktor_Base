package es.iesjandula.reaktor.base.security.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Francisco Manuel Benítez Chico
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoUsuario
{
	/** Atributo - email */
	private String email ;
	
	/** Atributo - nombre */
	private String nombre ;
	
	/** Atributo - apellidos */
	private String apellidos ;
	
	/** Atributo - roles */
	private List<String> roles ;
}
