package es.iesjandula.reaktor.base.security.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Francisco Manuel Benítez Chico
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoUsuarioExtended extends DtoUsuarioBase
{
	/** Atributo - roles */
	private List<String> roles ;
	
	/** Atributo - JWT */
	private String jwt ;
}
