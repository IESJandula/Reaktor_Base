package es.iesjandula.reaktor.base.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Francisco Manuel Benítez Chico
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
